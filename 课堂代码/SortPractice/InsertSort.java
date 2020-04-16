package biteHomework.SortPractice;

import java.util.Arrays;

public class InsertSort {
    public static void inserSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr={6,3,9,4,9,8,5,7};
        inserSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
