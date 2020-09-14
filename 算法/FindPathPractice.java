package 算法;


import java.util.ArrayList;

/*
输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。
路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class FindPathPractice {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();//存放符合结果集的路径
        ArrayList<Integer> list=new ArrayList<>();
        FindPathHelper(root,target,result,list);
        return result;
    }

    private void FindPathHelper(TreeNode root, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list) {
        if(root==null){
            return;
        }
        list.add(root.val);
        target-=root.val;
        if(root.left==null&&root.right==null&&target==0){
            result.add(new ArrayList<>(list));
        }
        FindPathHelper(root.left,target,result,list);
        FindPathHelper(root.right, target, result, list);
        list.remove(list.size()-1);
    }
}
