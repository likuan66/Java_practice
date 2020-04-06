package biteHomework.TreePractice;

public class buildTreepractice {
    private int index;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index=0;
        return buildTreeHelper(preorder,inorder,0,inorder.length);
    }

    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int left, int right) {
        if(left>=right){
            return null;//中序遍历结果为空，整个树为空数
        }
        if(index>=preorder.length){
            return null;//遍历元素结束
        }
        TreeNode root=new TreeNode(preorder[index]);
        index++;//节点创建完毕 就index++，准备下一个节点
        //根据该节点在中序遍历结果中的位置，把inorder数组划分成俩个部分
        int pos=find(inorder,left,right,root.val);
        //[left,pos)表示当前root左子树中序遍历结果
        //【pos+1，right）表示当前root右子树的遍历结果
        root.left=buildTreeHelper(preorder,inorder,left,pos);
        root.right=buildTreeHelper(preorder,inorder,pos+1,right);
        return root;
    }

    private int find(int[] inorder, int left, int right, int tofind) {
        for(int i=left;i<right;i++){
            if(inorder[i]==tofind){
                return i;
            }
        }
        return -1;
    }
}
