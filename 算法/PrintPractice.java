package 算法;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class PrintPractice {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(pRoot==null){
            return result;
        }
        Stack<TreeNode> s=new Stack<>();
        Queue<TreeNode> q=new LinkedList<>();//这是作为一个辅助队列
        s.push(pRoot);//先将根节点入队列
        int dir=1;//1：代表left->right式入栈. 2: 代表right->left式入栈
        ArrayList<Integer> list=new ArrayList<>();//保存每一层的数据
        while(!s.empty()){//一次while循环相当于一层
            int size=s.size();
            for(int i=0;i<size;i++){
                TreeNode cur=s.pop();//将栈中的元素出栈
                list.add(cur.val);
                TreeNode first=(dir==1)?cur.left:cur.right;//如果dir==1先将左子树入队列
                TreeNode second=(dir==1)?cur.right:cur.left;//如果dir==2先将右子树入队列
                if(first!=null){
                    q.offer(first);
                }
                if(second!=null){
                    q.offer(second);
                }
            }
            //本层遍历完毕
            result.add(new ArrayList<>(list));//将list中的一层数据放到结果集中
            list.clear();//必须清空，以便于下次数据的存取
            while(!q.isEmpty()){
                s.push(q.poll());//将所有队列中的元素入栈，进行逆序
            }
            dir=(dir==1)?2:1;
        }
        return result;
    }
}
