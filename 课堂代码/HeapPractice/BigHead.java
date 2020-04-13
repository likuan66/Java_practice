package biteHomework.HeapPractice;

import java.util.Arrays;

//按大堆来实现  大堆要求父节点比子节点大
public class BigHead {
    //size:array中那个部分为堆
    //index从那个位置开始进行向下调整
    public static void shiftDown(int[] array,int size,int index){
        int parent=index;
        int child=2*parent+1;//左子树
        while(child<size){
            if(child+1<size&&array[child+1]>array[child]){
                child=child+1;
            }
            if(array[child]>array[parent]){
                int temp=array[child];
                array[child]=array[parent];
                array[parent]=temp;
            }else{
                break;
            }
            parent=child;
            child=child*2+1;
        }
    }
    public static void createHeap(int[] array,int size){
        for(int i=(size-1-1)/2;i>=0;i--){
            shiftDown(array,size,i);
        }
    }

    public static void main(String[] args) {
        int[] array={9,5,2,8,7,4,1};
        createHeap(array,array.length);
        System.out.println(Arrays.toString(array));
    }
}
