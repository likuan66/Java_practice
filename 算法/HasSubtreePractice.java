package 算法;

public class HasSubtreePractice {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null||root2==null){
            return false;
        }
        boolean result=false;
        if(root1.val==root2.val){
            result=IsSumFromBegin(root1,root2);
        }
        if(result!=true){
            result=IsSumFromBegin(root1.left,root2);
        }
        if(result!=true){
            result=IsSumFromBegin(root1.right,root2);
        }
        return result;
    }
    public boolean IsSumFromBegin(TreeNode begin,TreeNode beginSub){
        if(beginSub==null){
            return true;
        }
        if(begin==null){
            return false;
        }
        if(begin.val!=beginSub.val){
            return false;
        }
        return IsSumFromBegin(begin.left,beginSub.left)&&IsSumFromBegin(begin.right,beginSub.right);
    }
}
