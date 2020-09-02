package 算法;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//从上往下打印出二叉树的每个节点，同层节点从左至右打印。
public class PrintFromTopToBottomPractice {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<Integer> result=new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode father=q.poll();
            result.add(father.val);
            if(father.left!=null){
                q.offer(father.left);
            }
            if(father.right!=null){
                q.offer(father.right);
            }
        }
        return result;
    }
}
