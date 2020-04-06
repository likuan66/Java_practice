package biteHomework.TreePractice;

import com.sun.source.tree.Tree;

public class ConvertPracctice {
    public TreeNode Convert(TreeNode pRootOfTree){
        //基于递归的方式来完成双向列表构建，为了确保有序性，需要中序遍历
        //二叉搜素树的中序遍历的结果是有序的
        if(pRootOfTree==null){
            return null;
        }
        if(pRootOfTree.left==null&&pRootOfTree.right==null){
            return pRootOfTree;
        }
        //最终的链表=左子树+根节点+右子树
        //就需要用左子树链表的尾巴和根节点相连
        //再用右子树的头部和根节点相连
        //1.先递归处理左子树
        //left就是左子树这个链表的头节点
        TreeNode left=Convert(pRootOfTree.left);
        //需要找到左子树；链表的为节点
        TreeNode leftTail=left;
        //right相当于链表的next  定位最后一个节点
        while(leftTail!=null&&leftTail.right!=null){
            leftTail=leftTail.right;
        }
        //循环结束之后，leftTail就指向了左侧链表的尾部
        //3.把左子树和当前节点连接在一起
        if(left!=null){
            leftTail.right=pRootOfTree;
            pRootOfTree.left=leftTail;
        }
        // 4. 递归转换右子树, 把右子树也变成双向链表
        TreeNode right = Convert(pRootOfTree.right);
        // 5. 把当前节点和右子树连在一起
        if (right != null) {
            right.left = pRootOfTree;
            pRootOfTree.right = right;
        }
        // 6. 最终返回 新的链表的头结点
        // 如果 left 为 null, 链表的头结点就是 pRootOfTree
        // 如果 left 非 null, 头结点就是 left
        return left == null ? pRootOfTree : left;
    }
}
