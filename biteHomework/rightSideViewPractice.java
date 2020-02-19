package day07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class rightSideViewPractice {

    public static void main(String[] args) {
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        TreeNode t4=new TreeNode(4);
        TreeNode t5=new TreeNode(5);
        TreeNode t6=new TreeNode(6);
        t1.right=t2;
        t2.right=t5;
        t5.left=t4;
        t5.right=t6;
        t6.left=t3;
        rightSideViewPractice rsv = new rightSideViewPractice();
        List<Integer> result=rsv.rightSideView(t1);
        System.out.println("二叉树的右视图为："+result);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList();
        if(root==null)return list;
        LinkedList<TreeNode> queue=new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                if(i==0)list.add(queue.getFirst().val);
                root=queue.poll();
                if(root.right!=null)queue.offer(root.right);
                if(root.left!=null)queue.offer(root.left);

            }
        }return list;
    }
}
