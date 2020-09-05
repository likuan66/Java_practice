package 算法;

import java.util.LinkedList;
import java.util.Queue;

/*
输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径
的长度为树的深度。
 */
public class TreeDepthPractice {
    //方法一：可以使用递归方式
//    private int max=0;
//    public int TreeDepth(TreeNode root) {
//        if(root==null){
//            return 0;
//        }
//        int depth=0;
//        TreeDepthHelper(root,depth);
//        return max;
//    }
//
//    private void TreeDepthHelper(TreeNode root, int depth) {
//        if(root==null){
//            if(max<depth){
//                max=depth;
//            }
//            return;
//        }
//        TreeDepthHelper(root.left,depth+1);
//        TreeDepthHelper(root.right,depth+1);
//    }
    //方法二：可以使用递归方式
//    public int TreeDepth(TreeNode root){
//        if(root==null){
//            return 0;
//        }
//        return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
//    }
    //方法三:可以层序遍历，统计层数，也就是深度or高度
    public int TreeDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int max=0;
        while(!q.isEmpty()){
            int size=q.size();
            max++;
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
        }
        return max;
    }
}
