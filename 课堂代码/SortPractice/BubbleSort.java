package biteHomework.SortPractice;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=array.length-1;j>i;j--){
                if(array[j-1]>array[j]){
                    int temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={9,0,7,9,5,3,326,8,8,9,};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
