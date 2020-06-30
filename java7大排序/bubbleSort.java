package Java7大排序;

import java.util.Arrays;

public class bubbleSort {
    public static void BubbleSort(int[] arr){
        boolean flag=true;
        for(int i=0;i<arr.length&&flag;i++){
            flag=false;
            for(int j=arr.length-1;j>i;j--){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    flag=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,4,7,2,5,8,3,6,9};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
