package biteHomework.HeapPractice;

public class MyPriorityQueue {
    //array看起来像个数组  其实是堆的结构
    private int[] array=new int[100];
    private int size=0;

    public void offer(int x){
        array[size]=x;
        size++;
        //把新的元素进行向上调整
        shiftUp(array,size-1);
    }

    private static void shiftUp(int[] array, int index) {
        int child=index;
        int parent=(child-1)/2;
        while(child>0){
            if(array[parent]<array[child]){
                //当前不符合大堆要求
                int temp=array[parent];
                array[parent]=array[child];
                array[child]=temp;
            }else{
                break;
            }
            child=parent;
            parent=(child-1)/2;
        }
    }
    public int poll(){
        //下标为0的元素就是队首元素，删掉的同时，我们也希望剩下的结构任然是一个堆
        int oldValue=array[0];
        array[0]=array[size-1];
        size--;
        shiftDown(array,size,0);
        return oldValue;
    }
    private static void shiftDown(int[] array, int size, int index) {
        int parent = index;
        int child = 2 * parent + 1;
        // 这个条件的含义是看看 parent 有没有子节点
        while (child < size) {
            // 把左右子树中较大的节点找到
            if (child + 1 < size && array[child + 1] > array[child]) {
                child = child + 1;
            }
            // 上述条件结束后, child 肯定对应左右子树中比较大的元素.
            // 再拿当前的这个 child 和 parent 位置的元素比较一下
            if (array[child] > array[parent]) {
                // 交换父子节点的位置
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
            } else {
                // 当前这个位置开始, 已经符合堆的要求了, 不需要继续调整
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }
    public int peek(){
        return array[0];
    }
    public boolean isEmpty(){
        return size==0;
    }

    public static void main(String[] args) {
        MyPriorityQueue queue=new MyPriorityQueue();
        queue.offer(9);
        queue.offer(5);
        queue.offer(2);
        queue.offer(7);
        queue.offer(3);
        queue.offer(6);
        queue.offer(8);
        while(!queue.isEmpty()){
            int cur=queue.poll();
            System.out.println(cur);
        }
    }
}
