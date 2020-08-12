package 代码专项练习.树;

//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
public class HasSubtreePractice {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null||root2==null){
            return false;
        }
        boolean result=false;
        if(root1.val==root2.val){
            result=IsSameFromBegin(root1,root2);
        }
        if(result!=true){
            result=HasSubtree(root1.left,root2);
        }
        if(result!=true){
            result=HasSubtree(root1.right,root2);
        }
        return result;
    }

    private boolean IsSameFromBegin(TreeNode root1, TreeNode root2) {
        if(root2==null){//说明已经比较完了
            return true;
        }
        if(root1==null){//root1为空，说明root2不是root1的子树
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        return IsSameFromBegin(root1.left,root2.left)&&IsSameFromBegin(root1.right,root2.right);
    }
}
