package lanqiao;

import java.util.Scanner;
public class PREV_4{
    static int sum1=0;
    static int sum2=0;
    static int  sum=0;
    static int min=10000;
    static int m;
    static int n;
    static int array[][]=new int[10][10];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        m=scanner.nextInt();
        n=scanner.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <= m; j++) {
                if(j==0) {
                    array[i][j]=0;
                    continue;
                }
                array[i][j]=scanner.nextInt();
            }
        }
        sum(0);
        if(min==10000) {
            System.out.println(0);
        }
        else {
            System.out.println(min);
        }


    }
    public static void sum(int a)
    {
        if(a==n) {
            //System.out.println(sum1+"----"+sum2);
            if(sum1==sum2) {
                if(sum<min) {
                    min=sum;
                }
            }
        }else {
            for (int i = 0; i <=m; i++) {
                sum2+=array[a][i];
            }
            int ss=sum1;
            for(int i=0;i<=m;i++) {
                sum1+=array[a][i];
                if(i!=0) sum++;
                sum2-=array[a][i];
                sum(a+1);
            }
            sum-=m;
            sum1=ss;
        }
    }
}
