package biteHomework.HeapPractice;

import java.util.Arrays;
//向下调整
//以小堆为例
public class SmallHead {
    //通过size指定array中那些元素是有效的堆元素
    //index表示从那个位置的下标开始
    //左右子树都是堆才能进行这样的调整
    public static void shiftDown(int[] array,int size,int index){
        int parent=index;
        int child=2*parent+1;//根据parent下标找到左子树的下标
        while(child<size){
            //比较左右子树  找到最小的
            if(child+1<size&&array[child+1]<array[child]){
                child=child+1;
            }
            //经过上述的比较  已经不知道child是左子树还是右子树
            //知道的是 child的下标一定对应左右子树中最小值的下标

            //拿child位置的元素 与parent对应的元素进行比较
            if(array[child]<array[parent]){
                //不符合小堆的规则，交换
                int temp=array[child];
                array[child]=array[parent];
                array[parent]=temp;
            }else{
                //不需要调整
                break;
            }
            //跟新parent和child  处理下一层数据
            parent=child;
            child=parent*2+1;
        }
    }
    public static void createHeap(int[] array,int size){
        for(int i=(size-1-1)/2;i>=0;i--){
            shiftDown(array,size,i);
        }
    }

    public static void main(String[] args) {
        int[] array={9,5,2,36,8,7,4,1};
        createHeap(array,array.length);
        System.out.println(Arrays.toString(array));
    }
}
