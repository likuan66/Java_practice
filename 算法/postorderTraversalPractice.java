package 算法;



import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//给定一个二叉树，返回它的 后序 遍历。
public class postorderTraversalPractice {
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        s1.push(root);
        TreeNode cur;
        while(!s1.isEmpty()){
            cur=s1.pop();
            s2.push(cur);
            if(cur.left!=null){
                s1.push(cur.left);
            }
            if(cur.right!=null){
                s1.push(cur.right);
            }
        }
        while(!s2.isEmpty()){
            list.add(s2.pop().val);
        }
        return list;
    }
}

