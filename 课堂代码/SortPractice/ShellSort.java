package biteHomework.SortPractice;

import java.util.Arrays;

public class ShellSort {
    public static void shellSort(int[] array) {
        int gap=array.length/2;
        while(gap>1){
            //需要循环进行分组插入排序
            insertSortGap(array,gap);
            gap=gap/2;
        }
        insertSortGap(array,1);
    }

    private static void insertSortGap(int[] array, int gap) {
        for (int bound = gap; bound < array.length; bound++) {
            int v = array[bound];
            int cur = bound - gap;  // 这个操作是在找同组中的上一个元素
            for (; cur >= 0; cur -= gap) {
                // 注意!!!! 这个条件如果写成 >= , 咱的插入排序就不是稳定排序了
                if (array[cur] > v) {
                    array[cur + gap] = array[cur];
                } else {
                    // 此时说明已经找到了合适的位置
                    break;
                }
            }
            array[cur + gap] = v;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,9,9,4,7,3,8,6};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
