package bite每日一题;

public class day03 {
    /*童鞋们在遇到这种类似数学的问题时，切记不要慌，我们来看一下这个题目。题目表达的意思很明
    确，3个空瓶子换一瓶饮料。如果给你10个空瓶，问你可以换多少饮料喝？我们可以在纸上简单画一下，这个题目
    的思路就出来了？*/
    public static int drink(int n){
        int total=0;
        while(n>2){
            total=total+n/3;
            n=n/3+n%3;
        }
        if(n==2){
            total=total+1;
        }
        return total;
    }
    /*
    数组的逆序对考题较多，比如示例的数组：[1,2,3,4,5,6,7,0] 那么，它包含逆序对有：{1,0},{2,0},
    {3,0},{4,0},{5,0},{6,0},{7,0}总共7个逆序对。再比如数组{7,5,6,4}，逆序对总共有5对，{7,5},
    {7,6},{7,4},{5,4,{6,4}；
     */
    public int count(int[] A,int n){
        if(A==null||n==0){
            return 0;
        }
        return mergeSortRecursion(A,0,n-1);
    }

    private static int mergeSortRecursion(int[] arr, int l, int r) {
        if(l==r){
            return 0;
        }
        int mid=(l+r)/2;
        return mergeSortRecursion(arr,l,mid)+mergeSortRecursion(arr,mid+1,r)+merge(arr,l,mid,r);
    }
    public static int merge(int[] arr,int left,int mid,int right){
        int[] temp=new int[right-left+1];
        int index=0;
        int i=left;
        int j=mid+1;
        int inverseNum=0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[index++] = arr[i++];
            } else {
                // 当前一个数组元素大于后一个数组元素时，累加逆序对
                // s[i] > s[j] -> s[i]...s[mid] > s[j]
                inverseNum += (mid - i + 1);
                temp[index++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[index++] = arr[i++];
        }
        while (j <= right) {
            temp[index++] = arr[j++];
        }
        for (int k = 0; k < temp.length; k++) {
            arr[left++] = temp[k];
        }
        return inverseNum;
    }
}
