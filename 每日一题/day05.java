package 每日一题;

import java.util.HashMap;

public class day05{
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j>=0;j--){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
    public int subarraySum02(int[] nums, int k) {
        // hash
        // 记录合适的连续字符串数量
        int count=0;
        // 记录前面数字相加之和
        int pre=0;
        // map记录前几个数字之和为K出现相同和的次数为V
        HashMap<Integer,Integer> map = new HashMap<>();
        // 初始化
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            pre+= nums[i];
            // 如果前面数字之和加上这个数字正好等于K（存在一个数字加上nums[i]结果为K
            // 说明找到了
            if (map.containsKey(pre-k)){
                // 累计
                count+=map.get(pre-k);
            }
            // 计算新的和放入map
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return count;
    }
}

