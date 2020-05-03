import java.util.Arrays;

public class shiftDownBig {
    public static void shiftDown(int[] array,int size,int index){
        int parent=index;
        int childer=2*parent+1;
        while(childer<size){
            if(childer+1<size&&array[childer+1]>array[childer]){
                childer=childer+1;
            }
            if(array[childer]>array[parent]){
                int temp=array[childer];
                array[childer]=array[parent];
                array[parent]=temp;
            }else{
                break;
            }
            parent=childer;
            childer=2*parent+1;
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
