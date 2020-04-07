package biteHomework.TreePractice;

public class isSubtreePractice {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        boolean ret = false;
        if (s.val == t.val) {
            //如果两个树的根节点相同  判断两棵树是否是相同的树
            ret = isSameTree(s, t);
        }
        return ret||isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //1.两个数都为空
        if(p==null&&q==null){
            return true;
        }
        //2.p或者q一个为空
        if(p==null||q==null){
            return false;
        }
        //3.两个都不为空的情况
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}


