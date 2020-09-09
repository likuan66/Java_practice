package 算法;

public class MoreHarfNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,2,2,2,2};
        int a=find(arr);
        System.out.println(a);
    }

    private static int find(int[] arr) {
        int targe=arr[0];
        int times=1;
        for(int i=1;i<arr.length;i++){
            if(times==0){
                targe=arr[i];
                times++;
            }
            if(targe==arr[i]){
                times++;
            }else{
                times--;
            }
        }
        times=0;
        for(int i=0;i<arr.length;i++){
            if(targe==arr[i]){
                times++;
            }
        }
        return times>arr.length/2 ? targe:0;
    }
}
