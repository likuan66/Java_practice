package 每日一题;

public class day15 {
    //输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
    public  boolean HasSubtree(TreeNode root1,TreeNode root2) {

        if (root1 == null || root2 == null) {
            return false;
        }
        //如果找到与子树相同根的值，走判断方法
        if (root1.val == root2.val) {
            if (isSubTree(root1, root2)) {
                return true;
            }
        }
        //遍历左孩子，右孩子
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }
    private boolean isSubTree(TreeNode A, TreeNode B) {
        if(A==null){
            return false;
        }
        if(B==null){
            return true;
        }
        if(A.val!=B.val){
            return false;
        }
      return isSubTree(A.left,B.left)&&isSubTree(A.right,B.right);
    }
    //操作给定的二叉树，将其变换为源二叉树的镜像。
    public void Mirror(TreeNode root) {
        if(root == null)
            return;
        if(root.left == null && root.right == null)
            return;

        TreeNode pTemp = root.left;
        root.left = root.right;
        root.right = pTemp;

        if(root.left != null)
            Mirror(root.left);
        if(root.right != null)
            Mirror(root.right);
    }
}
