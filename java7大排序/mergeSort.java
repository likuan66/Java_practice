package Java7大排序;


import java.util.Arrays;

public class mergeSort {
    public static void MergeSort(int[] array,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            MergeSort(array,left,mid);
            MergeSort(array,mid+1,right);
            merge(array,left,mid,right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] tmp=new int[array.length];//辅助数组
        int p1=left,p2=mid+1,k=left;//p1,p2表示检测指针，k存放指针
        while(p1<=mid&&p2<=right){
            if(array[p1]<=array[p2]){
                tmp[k++]=array[p1++];
            }else{
                tmp[k++]=array[p2++];
            }
        }
        while(p1<=mid){//如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
            tmp[k++]=array[p1++];
        }
        while(p2<=right){
            tmp[k++]=array[p2++];
        }
        //复制回原素组
        for(int i=left;i<=right;i++){
            array[i]=tmp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr={1,4,7,2,5,8,3,6,9};
        MergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
