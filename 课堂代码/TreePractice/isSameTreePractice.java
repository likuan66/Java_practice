package biteHomework.TreePractice;

public class isSameTreePractice {
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
