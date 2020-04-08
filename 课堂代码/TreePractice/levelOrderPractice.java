package biteHomework.TreePractice;

import java.util.LinkedList;
import java.util.Queue;

//层序遍历
public class levelOrderPractice {
    public void levelOrder(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            System.out.print(cur.val+" ");
            //把左右子树入队列
            if(cur.left!=null){
                queue.offer(cur.left);
            }
            if(cur.right!=null){
                queue.offer(cur.right);
            }
        }
    }
}
