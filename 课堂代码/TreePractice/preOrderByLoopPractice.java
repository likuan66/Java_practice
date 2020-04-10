package biteHomework.TreePractice;

import com.sun.source.tree.Tree;

import java.util.Stack;

public class preOrderByLoopPractice {
    public static void preOrderByLoop(TreeNode root) {
        //非递归遍历
        //需要一个栈来使用
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode top=stack.pop();
            //访问这个节点
            System.out.print(top.val+" ");
            //把右子树和左子树分别入栈
            if(top.right!=null){
                stack.push(top.right);
            }
            if(top.left!=null){
                stack.push(top.left);
            }
        }
    }
}
