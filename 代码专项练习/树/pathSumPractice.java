package 代码专项练习.树;
//给定一个二叉树，它的每个结点都存放着一个整数值。
//找出路径和等于给定数值的路径总数。
//路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
//二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
public class pathSumPractice {
    //使用双重递归，第一重先进行先序遍历每个节点，再以每个节点为起始点寻找满足条件的路径
    int count=0;
    public int pathSum(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        pathSumHelper(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return count;
    }

    private void pathSumHelper(TreeNode root, int sum) {
        if(root==null){
            return;
        }
        sum-=root.val;
        if(sum==0){
            count++;
        }
        pathSumHelper(root.left,sum);
        pathSumHelper(root.right,sum);
    }
}
