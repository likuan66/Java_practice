package 代码专项练习.树;

import java.util.ArrayList;

public class FindPathPractice {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target){
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
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
        FindPathHelper(root.right,target,result,list);
        list.remove(list.size()-1);
    }
}
