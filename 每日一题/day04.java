package 每日一题;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//给定一个非空整数数组，除了某个元素只出现一次以外，其
// 余每个元素均出现两次。找出那个只出现了一次的元素。
public class day04 {
    public static int singleNumber(int[] nums){
        int single=0;
        for(int ch:nums){
            single^=ch;
        }
        return single;
    }

    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0)
                sum = sum % k;
            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1)
                    return true;
            } else
                map.put(sum, i);
        }
        return false;
    }
    //给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
    public String longestPalindrome(String s) {
        String ans="";
        int max=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                String test=s.substring(i,j);
                if(isPalindromic(test)&&test.length()>max){
                    ans=s.substring(i,j);
                    max=Math.max(max,ans.length());//更新max
                }
            }
        }
        return ans;
    }

    private boolean isPalindromic(String s) {
        int len=s.length();
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
