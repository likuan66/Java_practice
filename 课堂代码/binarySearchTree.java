package biteHomework.BinarySearchTree;

public class binarySearchTree {
    public static class Node{
        int key;
        Node left;
        Node right;
        public Node(int key){
            this.key=key;
        }
    }
    private Node root=null;
    public Node find(int key){
        //查找key是否在树中存在，如果存在返回对应的Node
        Node cur=root;
        while(cur!=null){
            if(key<cur.key){
                cur=cur.left;
            }else if(key>cur.key){
                cur=cur.right;
            }else{
                return cur;
            }
        }
        return null;
    }
    // 二叉搜索树中不允许存在相同 key 的元素的.
    // 如果发现新插入的 key 重复了, 那就插入失败, 返回 false
    // 插入成功返回 true
    public boolean insert(int key){
        if(root==null){
            root=new Node(key);
            return true;
        }
        // 和查找类似, 需要先找到合适的位置. 再去插入元素
        Node cur=root;
        Node parent=null;// parent 始终指向 cur 的父节点. 和链表插入类似. 链表插入元素也需要记录指定位置的前一个元素
        while(cur!=null){
            if(key<cur.key){
                parent=cur;
                cur=cur.left;
            }else if(key>cur.key){
                parent=cur;
                cur=cur.right;
            }else{
                return false;
            }
        }
        // 循环结束的时候, cur 就指向 null, 当前元素就要插入到 parent 的子树位置上.
        // 具体是插到 parent 的左子树还是右子树呢? 就那 key 和 parent 再比较一次就知道了
        if(key<parent.key){
            parent.left=new Node(key);
        }else if(key>parent.key){
            parent.right=new Node(key);
        }
        return true;
    }
    // 删除成功返回 true, 删除失败返回 false
    // key 在树中存在, 就删除成功.
    // key 在树中不存在, 就删除失败.
    public boolean remove(int key){
        // 先找到要删除节点的位置, 再进行具体的删除
        // 找到这个待删除元素后, 再去判定是 a - f 中的哪种情况
        Node cur=root;
        Node parent=null;
        while(cur!=null){
            if(key<cur.key){
                parent=cur;
                cur=cur.left;
            }else if(key>cur.key){
                parent=cur;
                cur=cur.right;
            }else{
                // 找到要删除元素, 就是 cur 指向的节点
                // 在这个方法中去判定 a - f 这些情况并进行删除
                removeNode(parent,cur);
                return true;
            }
        }
        return false;
    }
    private void removeNode(Node parent, Node cur) {
        if (cur.left == null) {
            // 1. 要删除的元素没有左子树
            if (cur == root) {
                // 1.1 如果要删除节点为 root
                root = cur.right;
            } else if (cur == parent.left) {
                // 1.2 cur 是 parent 的左子树, 对应画图板的情况 a
                // 如果 cur 也没有右子树, 相当于
                // parent.left = null
                parent.left = cur.right;
            } else {
                // 1.3 cur 是 parent 的右子树, 对应画图板的情况 b
                parent.right = cur.right;
            }
        } else if (cur.right == null) {
            // 2. 要删除的元素没有右子树
            if (cur == root) {
                // 2.1 如果要删除节点是 root
                root = cur.left;
            } else if (cur == parent.left) {
                // 2.2 要删除节点是父节点的左子树, 对应画图板的情况 c
                parent.left = cur.left;
            } else {
                // 2.3 要删除节点是父节点的右子树, 对应画图板的情况 d
                parent.right = cur.left;
            }
        } else {
            // 3. 当前要删除节点有两个子树. 对应画图板的 e 和 f
            // 1) 先找到右子树中的最小元素(替罪羊)
            Node goatParent = cur;  // 替罪羊节点的父节点
            Node scapeGoat = cur.right; // 替罪羊节点
            while (scapeGoat.left != null) {
                goatParent = scapeGoat;
                scapeGoat = scapeGoat.left;
            }
            // 循环结束时, scapeGoat 指向了右子树中的最小值
            // 2) 把刚才找到的替罪羊的值赋给待删除节点.
            cur.key = scapeGoat.key;
            // 3) 删除替罪羊节点
            //    替罪羊节点一定没有左子树(和情况 a 和 b 类似)
            if (scapeGoat == goatParent.left) {
                goatParent.left = scapeGoat.right;
            } else {
                goatParent.right = scapeGoat.right;
            }
        }
    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.key + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.key + " ");
        inOrder(root.right);
    }
}
