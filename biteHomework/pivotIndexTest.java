package day04;

public class pivotIndexTest {
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        int sum=0;
        int sumleft=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            sum+=nums[i];
        }
        for(int i=0;i<len;i++){
            if(sumleft*2+nums[i]==sum){
                return i;
            }
            sumleft+=nums[i];
        }
        return -1;
    }
}
