package Java7大排序;

import java.util.Arrays;

public class heapSort {
    public static void HeapSort(int[] arr){
        createGeap(arr);
        for(int i=0;i<arr.length-1;i++){
            int heapSize=arr.length-i;
            swap(arr,0,heapSize-1);
            heapSize--;
            shiftDown(arr,heapSize,0);
        }
    }

    private static void createGeap(int[] arr) {
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            shiftDown(arr,arr.length,i);
        }
    }
    //大堆
    private static void shiftDown(int[] arr, int length, int i) {
        int parent=i;
        int child=2*parent+1;
        while(child<length){
            if(child+1<length&&arr[child+1]>arr[child]){
                child=child+1;
            }
            if(arr[child]>arr[parent]){
                swap(arr,child,parent);
            }else{
                break;
            }
            parent=child;
            child=child*2+1;
        }
    }

    private static void swap(int[] arr, int x, int y) {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int[] arr={1,4,7,2,5,8,3,6,9};
        HeapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
