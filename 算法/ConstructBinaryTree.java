package 算法;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class ConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if(pre.length==0||in.length==0){
            return null;
        }
        return reConstructBinaryTreeCore(pre,0,pre.length-1,in,0,in.length-1);
    }

    public TreeNode reConstructBinaryTreeCore(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if(preStart>preEnd||inStart>inEnd){
            return null;
        }
        TreeNode root=new TreeNode(pre[preStart]);

        for(int i=inStart;i<=inEnd;i++){
            if(in[i]==pre[preStart]){
                root.left=reConstructBinaryTreeCore(pre,preStart+1,i-inStart+preStart,in,inStart,i-1);
                root.right=reConstructBinaryTreeCore(pre,i-inStart+preStart+1,preEnd,in,i+1,inEnd);
                break;
            }
        }
        return root;
    }
}
