package biteHomework.TreePractice;

import java.util.Stack;

public class postOrderByLoopPractice {
    public static void postOrderByLoop(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        // prev 记录了当前已经访问过的节点中的最后一个节点. (即将被访问的元素的前一个节点)
        TreeNode prev = null;
        while (true) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            if (stack.isEmpty()) {
                break;
            }
            // 拿出栈顶元素的值, 看看能不能访问
            TreeNode top = stack.peek();
            if (top.right == null || prev == top.right) {
                // 此时说明这个栈顶元素是可访问的.
                // 这个条件就对应了刚才写的 a) b) 这两个条件
                System.out.print(top.val + " ");
                stack.pop();
                prev = top;  // 时刻维护好 prev 指向已经遍历完元素的最后一个.
            } else {
                cur = top.right;
            }
        }
    }


}
