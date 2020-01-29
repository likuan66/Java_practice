package lanqiao;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
/*
        给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
 */
public class BASIC_13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i==n-1){
                System.out.println(arr[i]);
            }else {
                System.out.print(arr[i] + " ");
            }
        }


    }
}
