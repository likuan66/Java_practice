import java.util.Arrays;
//以小堆为例  向下调整
public class ShiftDown {
    public static void shiftDown(int[] array,int size,int index){
        int left=2*index+1;
        while(left<size){
            int mid=left;
            int right=2*index+2;
            if(right<size){
                if(array[right]<array[left]){
                    mid=right;
                }
            }
            if(array[index]<=array[mid]){
                break;
            }
            int t=array[index];
            array[index]=array[mid];
            array[mid]=t;
            index=mid;
            left=2*index+1;
        }
    }
    public static void createHeap(int[] array,int size){
        for(int i=(size-1-1)/2;i>=0;i--){
            shiftDown(array,size,i);
        }
    }
    public static void main(String[] args) {
        int[] array = { 27,15,19,18,28,34,65,49,25,37 };
        createHeap(array,array.length);
        System.out.println(Arrays.toString(array));
    }
}
