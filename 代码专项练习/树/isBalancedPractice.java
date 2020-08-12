package 代码专项练习.树;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
//给定一个二叉树，判断它是否是高度平衡的二叉树。
public class isBalancedPractice {
    public boolean isBalanced(TreeNode root){
        if(root==null){
            return true;
        }
        if(root.left==null&&root.right==null){
            return true;
        }
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        if(leftDepth-rightDepth>1||leftDepth-rightDepth<-1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }

    private int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        return 1+(Math.max(leftDepth,rightDepth));
    }
}
