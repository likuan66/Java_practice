package biteHomework.SortPractice;

import java.util.Arrays;

public class HeapSort {
    public static void heapSort(int[] array){
        //先创建一个堆
        ccreateHeap(array);
        //循环把堆顶元素交换到最后，并进行调整堆
        //当循环到array.length-1的时候也就有序了
        for(int i=0;i<array.length-1;i++){
            //当前堆的元素个数
            int heapSize=array.length-i;
            // 交换 堆顶元素 和 堆的最后一个元素
            // 堆的元素个数相当于 array.length - i
            // 堆的最后一个元素下标 array.length - i - 1
            // 取堆的最后一个元素
            swap(array,0,heapSize-1);
            heapSize--;

            // 交换完成之后, 要把最后一个元素从堆中删掉
            // 堆的长度就又进一步缩水了 array.length - i - 1
            // 数组中
            // [0, array.length - i - 1) 待排序区间
            // [array.length - i - 1, array.length) 已排序区间
            // [注意!!!!] 这个代码中的边界条件特别容易搞错~~ -1 还是 不减 还是 + 1, 最好代入数值来验证.
            // 例如可以验证下 i = 0 的时候, 咱们的逻辑是否合理.
            shiftDown(array, heapSize, 0);
        }
    }

    private static void ccreateHeap(int[] array) {
        for(int i=(array.length-1-1)/2;i>=0;i--){
            shiftDown(array,array.length,i);
        }
    }

    private static void shiftDown(int[] array, int length, int i) {
        int parent=i;
        int child=2*parent+1;
        while(child<length){
            if(child+1<length&&array[child+1]>array[child]){
                child=child+1;
            }
            if(array[child]>array[parent]){
                swap(array,child,parent);
            }else{
                break;
            }
            parent=child;
            child=2*parent+1;
        }
    }

    private static void swap(int[] array, int child, int parent) {
        int temp=array[child];
        array[child]=array[parent];
        array[parent]=temp;
    }

    public static void main(String[] args) {
        int[] arr={2,8,0,4,8,5,8,7};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
