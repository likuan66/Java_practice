package biteHomework.SortPractice;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array){
        mergeSortHelper(array,0,array.length);
    }

    private static void mergeSortHelper(int[] array, int low, int high) {
        if(high-low<=1){
            return;
        }
        int mid=(low+high)/2;
        mergeSortHelper(array,low,mid);
        mergeSortHelper(array,mid,high);

        merge(array,low,mid,high);
    }

    public static void merge(int[] array, int low, int mid, int high) {
        int[] output = new int[high - low];
        int outputIndex = 0;  // 记录当前 output 数组中被放入多少个元素了
        int cur1 = low;
        int cur2 = mid;

        while (cur1 < mid && cur2 < high) {
            // 这里写成 <= 才能保证稳定性.
            if (array[cur1] <= array[cur2]) {
                output[outputIndex] = array[cur1];
                outputIndex++;
                cur1++;
            } else {
                output[outputIndex] = array[cur2];
                outputIndex++;
                cur2++;
            }
        }
        // 当上面的循环结束的时候, 肯定是 cur1 或者 cur2 有一个先到达末尾, 另一个还剩下一些内容
        // 把剩下的内容都一股脑拷贝到 output 中
        while (cur1 < mid) {
            output[outputIndex] = array[cur1];
            outputIndex++;
            cur1++;
        }

        while (cur2 < high) {
            output[outputIndex] = array[cur2];
            outputIndex++;
            cur2++;
        }

        // 把output中的元素再搬运回原来的数组 
        for (int i = 0; i < high - low; i++) {
            array[low + i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr={3,8,9,4,5,7,99,2,0};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
