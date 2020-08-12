package 代码专项练习.树;

//给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。
// 这条路径可能穿过也可能不穿过根结点。
public class diameterOfBinaryTreePractice {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        //遍历每一个节点，以每一个节点为中心点计算最长路径（左子树边长+右子树边长），更新全局变量max。
        if(root==null){
            return 0;
        }
        dfs(root);
        return max;
    }

    private int dfs(TreeNode root) {
        if(root.left==null&&root.right==null){
            return 0;
        }
        int leftMax=root.left==null?0:dfs(root.left)+1;
        int rightMax=root.right==null?0:dfs(root.right)+1;
        max=Math.max(max,leftMax+rightMax);
        return Math.max(leftMax,rightMax);
    }
}
