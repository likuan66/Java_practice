package 代码专项练习.哈希表;

import java.util.HashSet;
import java.util.Set;

//给定一个未排序的整数数组，找出最长连续序列的长度。
//
//要求算法的时间复杂度为 O(n)。
public class longestConsecutivePractice {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longStreak=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int currentStreak=1;
                while(set.contains(currentNum+1)){
                    currentNum+=1;
                    currentStreak+=1;
                }
                longStreak=Math.max(longStreak,currentStreak);
            }
        }
        return longStreak;
    }
}
