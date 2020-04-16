package biteHomework.SortPractice;


public class QuickSort {
    public static void quickSort(int[] array){
        quickSortHelper(array,0,array.length-1);
    }

    private static void quickSortHelper(int[] array, int left, int right) {
        if(left>=right){
            //区间有0个或者一个元素 不需要排序
            return;
        }
        // 针对 [left, right] 区间进行整理
        // index 返回值就是整理完毕后, left 和 right 的重合位置. 知道了这个位置, 才能进一步进行递归
        int index=partition(array,left,right);
        quickSortHelper(array,left,index-1);
        quickSortHelper(array,index+1,right);
    }

    private static int partition(int[] array, int left, int right) {
        int begin=left;
        int end=right;
        //取最右侧元素为基准值
        int base=array[right];
        while(begin<end){
            while(begin<end&&array[begin]<=base){
                begin++;
            }
            swap(array,begin,end);
        }
        swap(array,begin,right);
        return begin;
    }

    private static void swap(int[] array, int begin, int end) {
        int temp=array[begin];
        array[begin]=array[end];
        array[end]=temp;
    }

}
