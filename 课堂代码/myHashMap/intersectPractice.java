package biteHomework.MyHsahMap;

import java.util.*;

public class intersectPractice {
    /*
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length==0){
            return nums2;
        }
        if(nums2.length==0){
            return nums1;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<>();
        for(int i=0,j=0;i<nums1.length&&j<nums2.length;){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1){
            map.put(num,map.getOrDefault(num,0) + 1) ;
        }

        List<Integer> resultList = new ArrayList<>() ;
        for (int num : nums2){
            if(map.getOrDefault(num,-1) > 0){
                resultList.add(num) ;
                map.put(num,map.get(num) -1) ;
            }
        }


        int[] result = new int[resultList.size()] ;

        int index =0 ;
        for (int num : resultList)
            result[index ++] = num ;
        return result;
    }
}
