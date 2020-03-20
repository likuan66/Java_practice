package lanqiao;
/*
小明这些天一直在思考这样一个奇怪而有趣的问题：
在1~N的某个全排列中有多少个连号区间呢？这里所说的连号区间的定义是：
如果区间[L, R] 里的所有元素（即此排列的第L个到第R个元素）递增排序后能得到一个长度为R-L+1的“连续”数列，则称这个区间连号区间。
当N很小的时候，小明可以很快地算出答案，但是当N变大的时候，问题就不是那么简单了，现在小明需要你的帮助。
 */
import java.util.Scanner;

public class PREV_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int min=a[i];
            int max=a[i];
            for(int j=i;j<n;j++){
                if(a[j]>max){
                    max=a[j];
                }
                if(a[j]<min) {
                    min = a[j];
                }
                if(max-min==j-i){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
