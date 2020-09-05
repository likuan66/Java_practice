package 算法;

import java.util.Arrays;

public class test {


    public static void main(String[] args) {
        int[] arr={1,4,3,2,5,8,3,4,9};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr) {
        int gap=arr.length/2;
        while(gap>1){
            insertSortGap(arr,gap);
            gap/=2;
        }
        insertSortGap(arr,1);
    }

    private static void insertSortGap(int[] arr, int gap) {
        for(int i=gap;i<arr.length;i++){
            int val=arr[i];
            int j=i-gap;
            for(;j>=0;j-=gap){
                if(val<arr[j]){
                    arr[j+gap]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+gap]=val;
        }
    }


}
