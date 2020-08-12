package 代码专项练习.树;

//给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。

import java.util.Stack;

public class KthNodePractice {
    TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot==null||k<=0){
            return null;
        }
        Stack<TreeNode> st=new Stack<>();
        TreeNode node=pRoot;
        do{
            while(node!=null){
                st.push(node);
                node=node.left;
            }
            if(!st.empty()){
                node=st.pop();
                k--;
                if(k==0){
                    return node;
                }
                node=node.right;
            }
        }while(node!=null||!st.empty());
        return null;
    }
}
