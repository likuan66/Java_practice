package 算法;

//根据一棵树的中序遍历与后序遍历构造二叉树。

public class buildTreePractice {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder,0,inorder.length-1,postorder,postorder.length-1);

    }
    public TreeNode helper(int[] inorder,int start,int end,int[] postorder,int postEnd){
        if(start>end){
            return null;
        }
        int current=postorder[postEnd];//找到后序遍历的最后一个元素就是根节点
        TreeNode root=new TreeNode(current);
        int index=0;
        for(int i=start;i<=end;i++){
            if(current==inorder[i]){//在中序遍历中找到这个节点，就是中序遍历的根节点
                index=i;
            }
        }
        //中序遍历根节点的左边就是左子树，然后递归遍历左子树
        TreeNode left=helper(inorder,start,index-1,postorder,postEnd-(end-index)-1);
        //中序遍历根节点的右边就是右子树，然后递归遍历右子树
        TreeNode right=helper(inorder,index+1,end,postorder,postEnd-1);
        root.left=left;
        root.right=right;
        return root;
    }
}
