package 每日一题;

import java.util.HashSet;
import java.util.Set;
//无重复数字的字符串
class ListNode{
    int val;
    ListNode next;

    public ListNode(int x) {
        this.val = x;
    }
}
public class day02 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk=-1,ans=0;
        for(int i=0;i<s.length();i++){
            if(i!=0){
                set.remove(s.charAt(i-1));
            }
            while(rk+1<s.length()&&!set.contains(s.charAt(rk+1))){
                //不断移动右指针
                set.add(s.charAt(rk+1));
                ++rk;
            }
            ans=Math.max(ans,rk-i+1);
        }
        return ans;
    }
    //递归（合并两个有序链表）
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }else if (l2 == null) {
            return l1;
        }else if(l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
    //迭代（合并两个有序链表）
    public ListNode mergeTwoLists01(ListNode l1, ListNode l2){
        ListNode head=new ListNode(-1);
        ListNode prev=head;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                prev.next=l1;
                l1=l1.next;
            }else{
                prev.next=l2;
                l2=l2.next;
            }
            prev=prev.next;
        }
        if(l1==null){
            prev.next=l2;
        }
        if(l2==null){
            prev.next=l1;
        }
        return head.next;
    }
    /*
    给定一个非负整数数组，你最初位于数组的第一个位置。
    数组中的每个元素代表你在该位置可以跳跃的最大长度。
    你的目标是使用最少的跳跃次数到达数组的最后一个位置。
     */
    public int jump(int[] nums) {
        int position = nums.length - 1;
        int steps = 0;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    steps++;
                    break;
                }
            }
        }
        return steps;
    }
    //计算并返回 x 的平方根，其中 x 是非负整数。
    //由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
    public int mySqrt(int x) {
        //二分查找
       int left=0,right=x,ans=-1;
       while(left<=right){
           int mid=left+(right-left)/2;
           if((long)mid*mid<=x){
               ans=mid;
               left=mid+1;
           }else{
               right=mid-1;
           }
       }
       return ans;
    }
    //给定一个二叉树，判断其是否是一个有效的二叉搜索树。
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
    private boolean helper(TreeNode node, Integer lower, Integer upper) {
        if(node==null){
            return true;
        }
        int val=node.val;
        if(lower!=null&&val<=lower){
            return false;
        }
        if(upper!=null&&val>=upper){
            return false;
        }
        if(!helper(node.right,val,upper)){
            return false;
        }
        if(!helper(node.left,lower,val)){
            return false;
        }
        return true;
    }
    //在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积
    public int maximalSquare(char[][] matrix) {
        /**
         dp[i][j]表示以第i行第j列为右下角所能构成的最大正方形边长, 则递推式为:
         dp[i][j] = 1 + min(dp[i-1][j-1], dp[i-1][j], dp[i][j-1]);
         **/
        int m = matrix.length;
        if(m < 1) return 0;
        int n = matrix[0].length;
        int max = 0;
        int[][] dp = new int[m+1][n+1];

        for(int i = 1; i <= m; ++i) {
            for(int j = 1; j <= n; ++j) {
                if(matrix[i-1][j-1] == '1') {
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        return max*max;
    }
}
