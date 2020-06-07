package bite每日一题;

public class day02 {
    /*
     有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。
     给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在
     */
    public static void main(String[] args) {
        int[] arr={1,3,5,2,2};
        int n=5;
        int k=3;
        int result=findKth(arr,n,k);
        System.out.println(result);
    }

    private static int findKth(int[] arr, int n, int k) {
        return FindKth(arr,0,n-1,k);
    }

    private static int FindKth(int[] arr, int low, int high, int k) {
        int part=partation(arr,low,high);
        if(k==part-low+1)return arr[part];
        else if(k>part-low+1)return FindKth(arr,part+1,high,k-part+low+1);
        else return FindKth(arr,low,part-1,k);
    }

    private static int partation(int[] arr, int low, int high) {
        int key=arr[low];
        while(low<high){
            while(low<high&&arr[high]<=key){
                high--;
            }
            arr[low]=arr[high];
            while(low<high&&arr[low]>=arr[high]){
                low++;
            }
            arr[high]=arr[low];
        }
        arr[low]=key;
        return low;
    }

}
