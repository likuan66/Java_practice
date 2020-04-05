package biteHomework.TreePractice;
/*
判断一个树是否为平衡二叉树 分为两个阶段
1.任何一个节点都有两个子树
    当遇到某个节点只有左子树  而没有右子树的时候  切换到第二阶段
    如果遇到某个节点没有左子树 只有右子树的时候  肯定不是完全二叉树、
2.任何一个节点一定没有子树
    当层序遍历结束之后，正棵树一直满足上述要求 一定是完全二叉树
 */
import java.util.LinkedList;
import java.util.Queue;

public class isCompleteTreePractice {
    public boolean isCompleteTree(TreeNode root){
        if(root==null){
            return true;
        }
        boolean isSecondStep=false;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            //针对当前节点进行访问

            if(!isSecondStep){
                //这是第一阶段
                if(cur.left!=null&&cur.right!=null){
                    //直接把两个子树入队列
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                }else if(cur.left==null&&cur.right!=null){
                    //当前第一个阶段的左子树为空 右子树不为空  则一定不是完全二叉树
                    return false;
                }else if(cur.left!=null&&cur.right==null){
                    //左子树不为空  右子树为空 切换到第二阶段
                    isSecondStep=true;
                    queue.offer(cur.left);
                }else{
                    //左右子树都为空 也要切换到第二阶段
                    isSecondStep=true;
                }
            }else{
                //这是第二阶段
                //要求第二阶段中的每个节点都必须不包含字数
                //如果有一个不为空就返回错误
                if(cur.right!=null||cur.left!=null){
                        return false;
                }
            }
        }
        //整个树遍历完了 都没有找到反例 则最终 return true   认为就是完全二叉树
        return true;
    }
}
