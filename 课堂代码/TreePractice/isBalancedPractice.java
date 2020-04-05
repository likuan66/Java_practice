package biteHomework.TreePractice;

public class isBalancedPractice {
    public boolean isBalanced(TreeNode root) {
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
    public int maxDepth(TreeNode root){
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
