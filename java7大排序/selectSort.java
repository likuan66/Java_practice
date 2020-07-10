package Java7大排序;

import java.util.Arrays;

public class selectSort {
    public static void SelectSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(i!=min){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,4,7,2,5,8,3,6,9};
        SelectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
