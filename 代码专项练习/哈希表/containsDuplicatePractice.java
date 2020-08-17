package 代码专项练习.哈希表;

import java.util.HashSet;
import java.util.Set;

//给定一个整数数组，判断是否存在重复元素。
//如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
public class containsDuplicatePractice {
    public boolean containsDuplicate(int[] nums){
        Set<Integer> set=new HashSet<>();
        for(int a:nums){
            set.add(a);
        }
        return set.size()<nums.length?true:false;
    }
}
