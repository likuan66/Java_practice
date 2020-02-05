package biteHomework;

public class searchInsertNumber {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,7};
        int key=6;
        System.out.println(searchInsert(nums,key));
    }
    public static int searchInsert(int[] nums,int target){
        if(nums==null||nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
