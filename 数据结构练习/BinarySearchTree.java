public class BinarySearchTree {
    public class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }
    //查找
    private Node root=null;
    public Node search(int key){
        Node cur=root;
        while(cur!=null){
            if(cur.key==key){
                return cur;
            }else if(cur.key<key){
                cur=cur.left;
            }else{
                cur=cur.right;
            }
        }
        return null;
    }
    //插入
    public  boolean insert(int key){
        if(root==null){
            root=new Node(key);
            return true;
        }
        Node cur=root;
        Node parent=null;
        while(cur!=null){
            if(cur.key==key){
                return false;
            }else if(cur.key<key){
                parent=cur;
                cur=cur.left;
            }else{
                parent=cur;
                cur=cur.right;
            }
        }
        Node node=new Node(key);
        if(key<parent.key){
            parent.left=node;
        }else if(key>parent.key){
            parent.right=node;
        }
        return true;
    }
    public boolean remove(int key){
        Node cur=root;
        Node parent=null;
        while(cur!=null){
            if(cur.key==key){
                removeNode(parent,cur);
                return true;
            }else if(cur.key<key){
                parent=cur;
                cur=cur.left;
            }else{
                parent=cur;
                cur=cur.right;
            }
        }
        return false;
    }

    private void removeNode(Node parent, Node cur) {
        if(cur.left==null){
            if(cur==root){
                root=cur.right;
            }else if(cur==parent.left){
                parent.left=cur.right;
            }else if(cur==parent.right){
                parent.right=cur.right;
            }
        }else if(cur.right==null){
            if(cur==root){
                root=cur.left;
            }else if(cur==parent.left){
                parent.left=cur.left;
            }else if(cur==parent.right){
                parent.right=cur.left;
            }
        }else{
            Node goatParent=cur;
            Node goat=cur.right;
            while(goat.left!=null){
                goatParent=goat;
                goat=goat.left;
            }
            cur.key=goat.key;
            if(goat==goatParent.left){
                goatParent.left=goat.right;
            }else{
                goatParent.right=goat.right;
            }
        }
    }
}
