package biteHomework.MyHsahMap;

import java.util.HashMap;

public class containsNearbyDuplicatePractice {
    /*
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]&&j-i<=k){
                    return true;
                }
            }
        }
        return false;
    }
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        if(k == 0) return false;
        if(n <= 0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.get(nums[i]) != null && (i - map.get(nums[i])) <= k) return true;
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        int k=3;
        System.out.println(containsNearbyDuplicate(arr,k));
    }
}
