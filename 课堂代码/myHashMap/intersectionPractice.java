package biteHomework.MyHsahMap;

import java.util.*;

public class intersectionPractice {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int num:nums1){                 //先对一个数组去重后添加到set中
            if(!hashSet.contains(num)){
                hashSet.add(num);
            }
        }

        for(int num:nums2){
            if(hashSet.contains(num)){
                if(!list.contains(num)){        //这里的判断是为了避免重复添加相同的数
                    list.add(num);
                }
            }
        }


        //将list转换成int数组
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }

        return res;
    }

   /* public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }

        for (int j = 0; j < nums2.length; j++) {
            if (map.containsKey(nums2[j])) {
                set.add(nums2[j]);
            }
        }

        int[] res = new int[set.size()];
        Iterator iterator = set.iterator();
        int k = 0;
        while (iterator.hasNext()) {
            res[k] = (int) iterator.next();
            k++;
        }

        return res;
    }

    */
}
