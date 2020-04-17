package biteHomework.SortPractice;

import java.util.Arrays;

public class SelectSort {
    public static void selectSort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[i]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,9,8,0,7,4,6,7};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
