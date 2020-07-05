package Java7大排序;

import java.util.Arrays;

public class quickSort {
    public static void QuickSort(int[] arr){
        quickSortHelp(arr,0,arr.length-1);
    }

    private static void quickSortHelp(int[] arr, int left, int right) {
        if(left>right){
            return;
        }
        int temp=arr[left];
        int i=left;
        int j=right;
        while(i<j){
            while(i<j&&arr[j]>temp){
                j--;
            }
            arr[i]=arr[j];
            while(i<j&&arr[i]<=temp){
                i++;
            }
            arr[j]=arr[i];
        }
        arr[i]=temp;
        quickSortHelp(arr,left,i-1);
        quickSortHelp(arr,j+1,right);
    }
    public static void main(String[] args) {
        int[] arr={1,4,7,2,5,8,3,6,9};
        QuickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
