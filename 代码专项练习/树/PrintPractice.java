package 代码专项练习.树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
// 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
public class PrintPractice {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(pRoot==null){
            return result;
        }
        Stack<TreeNode> stack=new Stack<>();
        Queue<TreeNode> queue=new LinkedList<>();//作为一个辅助队列
        stack.push(pRoot);
        int dir=1;//1：代表从左到右，2：代表从右到左
        ArrayList<Integer> list=new ArrayList<>();
        while(!stack.empty()){
            int size=stack.size();
            for(int i=0;i<size;i++){
                TreeNode cur=stack.pop();//出栈
                list.add(cur.val);
                TreeNode first=(dir==1)?cur.left:cur.right;
                TreeNode second=(dir==2)?cur.right:cur.left;
                if(first!=null){
                    queue.offer(first);
                }
                if(second!=null){
                    queue.offer(second);
                }
            }
            result.add(new ArrayList<>(list));
            list.clear();
            while(!queue.isEmpty()){
                stack.push(queue.poll());
            }
            dir=(dir==1)?2:1;
        }
        return result;
    }
}
