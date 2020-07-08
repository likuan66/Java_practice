package Java7大排序;

import java.util.Arrays;

public class shellSort {
    public static void ShellSort(int[] arr){
        int gap=arr.length/2;
        while(gap>1){
            insertSortGap(arr,gap);
            gap=gap/2;
        }
        insertSortGap(arr,1);
    }

    private static void insertSortGap(int[] arr, int gap) {
        for(int bound=gap;bound<arr.length;bound++){
            int v=arr[bound];
            int cur=bound-gap;//找同组中上一个元素
            for(;cur>=0;cur-=gap){
                // 注意!!!! 这个条件如果写成 >= , 咱的插入排序就不是稳定排序了
                if(arr[cur]>v){
                    arr[cur+gap]=arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+gap]=v;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,4,7,2,5,8,3,6,9};
        ShellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
