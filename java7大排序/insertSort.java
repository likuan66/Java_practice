package Java7大排序;

import java.util.Arrays;

public class insertSort {
    public static void InsertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            //有序区间【0，i】
            //无序区间【i，arr.length】
            int v=arr[i];//无序区间的第一个元素
            int j=i-1;//有序元素最后一个元素的下标
            for(;j>=0&&arr[j]>v;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=v;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,4,7,2,5,8,3,6,9};
        InsertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
