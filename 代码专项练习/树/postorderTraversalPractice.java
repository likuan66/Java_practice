package 代码专项练习.树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//二叉树的后续遍历非递归
public class postorderTraversalPractice {
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        stack1.push(root);
        TreeNode cur;
        while(!stack1.isEmpty()){
            cur=stack1.pop();
            stack2.push(cur);
            if(cur.left!=null){
                stack1.push(cur.left);
            }
            if(cur.right!=null){
                stack1.push(cur.right);
            }
        }
        while(!stack2.isEmpty()){
            list.add(stack2.pop().val);
        }
        return list;
    }
}
