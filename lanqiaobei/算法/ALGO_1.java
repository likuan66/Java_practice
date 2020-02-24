package lanqiao;

import java.util.Arrays;
import java.util.Scanner;
/*
第一行包含一个数n，表示序列长度。
第二行包含n个正整数，表示给定的序列。
第三个包含一个正整数m，表示询问个数。
接下来m行，每行三个数l,r,K，表示询问序列从左往右第l
个数到第r个数中，从大往小第K大的数是哪个。序列元素从1开始标号。
 */
public class ALGO_1 {
    public static void main(String[] ages){
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        int[] array=new int[n+1];
        //输入给定的序列                             注意：序列的顺序是不可以变得。
        for(int i=1;i<=n;i++){
            array[i]=sc.nextInt();
        }
        //询问个数
        m=sc.nextInt();
        int[] l=new int[m+1];
        int[] r=new int[m+1];
        int[] k=new int[m+1];
        for(int i=0;i<m;i++){
            l[i]=sc.nextInt();
            r[i]=sc.nextInt();
            k[i]=sc.nextInt();
        }
        //分别输出要求
        //第一 先截取l到r这一段距离
        int[][] point=new int[m][n+1];
        int sum=1;
        for(int i=0;i<m;i++){
            for(int j=l[i];j<=r[i];j++){

                point[i][sum++]=array[j];
            }
            //把拿出来这一段进行排序
            Arrays.sort(point[i]);
            String st=Arrays.toString(point[i]);
            System.out.println(point[i][(point[i].length-k[i])]);   //排序是从小到大的，所以要从数组后面开始数K。
            sum=1;
        }
    }
}
