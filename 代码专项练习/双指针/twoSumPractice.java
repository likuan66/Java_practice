package 代码专项练习.双指针;

//给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
//
//函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
public class twoSumPractice {
    public int[] twoSum(int[] numbers, int target) {
        int low=0,high=numbers.length-1;
        while(low<high){
            int sum=numbers[low]+numbers[high];
            if(sum==target){
                return new int[]{low+1,high+1};
            }else if(sum<target){
                low++;
            }else{
                high--;
            }
        }
        return new int[]{-1,-1};
    }
}
