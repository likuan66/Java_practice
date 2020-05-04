import java.util.Arrays;

public class Sort {
    //插入排序
    public static void insertSort(int[] array){
        for(int i=1;i<array.length;i++){
            int v=array[i];//无序区间的第一个元素
            int j=i-1;//有序元素最后一个元素的下标
            for(;j>=0&&array[j]>v;j--){
                array[j+1]=array[j];
            }
            array[j+1]=v;
        }
    }

    //冒泡排序
    public static void bubbleSort(int[] array){
        boolean flag=true;
        for(int i=0;i<array.length&&flag;i++){
            flag=false;
            for(int j=array.length-1;j>i;j--){
                if(array[j-1]>array[j]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    flag=true;
                }
            }
        }
    }
    //选择排序
    public static void selectSort(int[] array){

        for(int i=0;i<array.length;i++){
            int min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            if(i!=min){
                int temp=array[i];
                array[i]=array[min];
                array[min]=temp;
            }
        }
    }
    //希尔排序
    public static void shellSort(int[] array){
        int gap=array.length/2;
        while(gap>1){
            insertSortGap(array,gap);
            gap=gap/2;
        }
        insertSortGap(array,1);
    }
    public static void  insertSortGap(int[] array,int gap){
        for(int bound=gap;bound<array.length;bound++){
            int v=array[bound];
            int cur=bound-gap;
            for(;bound>=0;bound-=gap){
                if(v<array[cur]){
                    array[cur+gap]=array[cur];
                }else{
                    break;
                }
            }
            array[cur+gap]=v;
        }
    }
    //堆排序
    public static void heapSort(int[] array){
        createHeap(array);
        for(int i=0;i<array.length-1;i++){
            int heapSize=array.length-i;
            swap(array,0,heapSize-1);
            heapSize--;
            shiftDown(array,heapSize,0);
        }
    }

    private static void createHeap(int[] array) {
        for(int i=(array.length-1-1)/2;i>=0;i--){
            shiftDown(array,array.length,i);
        }
    }
    public static void shiftDown(int[] array,int lengh,int key){
        int parent=key;
        int child=2*parent+1;
        while(child<lengh){
            if(child+1<lengh&&array[child+1]>array[child]){
                child=child+1;
            }
            if(array[child]>array[parent]){
                swap(array,child,parent);
            }else{
                break;
            }
            parent=child;
            child=parent*2+1;
        }
    }

    private static void swap(int[] array, int x, int y) {
        int temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }

    //快速排序\
    public static void quickSort(int[] array){
        quickSortHelp(array,0,array.length-1);
    }
    public static void quickSortHelp(int[] a,int left,int right){
        if (left >= right)//如果左边的值大于右边的值说明已经完成了一组的执行
        {
            return;
        }
        int temp = a[left];//将第一个元素设为对比元素（参考值）
        int i = left;
        int j = right;
        while (i < j)
        {
            while (i<j && a[j]>temp)//如果这个参考值小于右边所比较的元素，则j--，进行右边的下一个元素与参考值比较
            {
                j--;
            }
            a[i] = a[j];  //找到了一个比参考值小的数，把这个数放在前面  （原来取参考值的位置）
            while (i <j && a[i] <= temp)//如果参考值大于等于右边所比较的元素，则i++；进行下一个元素与参考值的比较
            {
                i++;
            }
            a[j] = a[i];  //找到了一个比参考值大的数，把这个数放到后面（刚刚放再前面那个数的位置）
        }
        a[i] = temp;   //当在当组内找完一遍以后就把中间数temp回归
        quickSortHelp(a, left, i - 1);  //最后用同样的方式对分出来的左边的小组进行同上的做法
        quickSortHelp(a, j + 1, right);  //用同样的方式对分出来的右边的小组进行同上的做法

    }

    public static void mergeSort(int[] array,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(array,left,mid);
            mergeSort(array,mid+1,right);
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
        while(p1<=mid){
            tmp[k++]=array[p1++];
        }
        while(p2<=right){
            tmp[k++]=array[p2++];
        }
        for(int i=left;i<=right;i++){
            array[i]=tmp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr={1,4,7,2,5,8,3,6,9};
        //insertSort(arr);
        //bubbleSort(arr);
        //selectSort(arr);
        //heapSort(arr);
        //quickSort(arr);
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
