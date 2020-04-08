package biteHomework.TreePractice;

public class lowestCommonAncestorPractice {
    //lca表示公共祖先
    private TreeNode lac=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        //findNode递归找的过程，一旦找到就把结果放到lac中
        findNode(root,p,q);
        return lac;
    }
    // 看从 root 出发能不能找到 p 或者 q. 只要找到 1 个, 就返回 true, 都找不到返回 false
    private boolean findNode(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return false;
        }
        //递归按照先后遍历的方式来查找
        int left=findNode(root.left,p,q)?1:0;
        int right=findNode(root.right,p,q)?1:0;
        int mid=(root==p||root==q)?1:0;
        if(left+right+mid==2){
            lac=root;
        }
        // 如果三个位置之和 为 0 表示没找到. 返回 false
        // 只要能找到 1 个或者以上, 都返回 true
        return (left+mid+right)>0;
    }
}
