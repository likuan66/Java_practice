package biteHomework;

public class removeElementArray {
    public static void main(String[] args) {
        int[] num={3,3,2,2};
        int key=3;
        System.out.println(removeElement(num,key));
    }
    public static int removeElement(int[] nums,int val){
        if(nums==null||nums.length==0){
            return 0;
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}