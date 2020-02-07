package day03;

import java.util.Arrays;

public class contains {
    public static void main(String[] args) {
        int[] num={1,2,3,1};
        System.out.println(containsDuplicate(num));
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i+1] == nums[i]) {
                return true;
            }
        }
        return false;
    }
}
