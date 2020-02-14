package day05;

import java.util.Arrays;

public class twoSumNumber {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int key=9;
        int[] a=twoSum(arr,key);
        System.out.println(Arrays.toString(a));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] index=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>i;j--){
                if(nums[i]+nums[j]==target){
                    index[0]=i;
                    index[1]=j;
                    return index;
                }
            }
        }
        return index;
    }
}
