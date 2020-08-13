package 代码专项练习.树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//二叉树的前序遍历非递归
public class preorderTraversalPractice {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            list.add(Integer.valueOf(node.val));
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }
        return list;
    }
}
