package demo10;

/*
        这些异常都是运行期异常，无需处理
        注意： NullPointerException是一个运行期异常，我们不用处理，默认交给jvm处理
        ArrayIndexOutOfBoundsException是一个运行期异常，我们不用处理，默认交给jvm处理
 */
public class DemoThrow {
    public static void main(String[] args) {
        //int[] arr=null;
        int[] arr=new int[3];
        int e=getElement(arr,3);
        System.out.println(e);
    }
    public static int getElement(int[] arr,int index){
        if(arr==null){
            throw new NullPointerException("传递的数组是null");
        }
        if(index<0||index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("传递的索引超出数值的范围");
        }
        int ele=arr[index];
        return ele;
    }
}
