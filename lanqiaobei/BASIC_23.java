package lanqiao;

import java.util.Scanner;

/*
     有n（2≤n≤20）块芯片，有好有坏，已知好芯片比坏芯片多。
　　每个芯片都能用来测试其他芯片。用好芯片测试其他芯片时，能正确给出被测试芯片是好还是坏。
    而用坏芯片测试其他芯片时，会随机给出好或是坏的测试结果（即此结果与被测试芯片实际的好坏无关）。
　　给出所有芯片的测试结果，问哪些芯片是好芯片。
 */
public class BASIC_23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] arr=new int[n+1][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int t = 0,f = 0;//  t表示值为“1”的次数，f表示值为“0”的次数，注意每轮循环要置0
            for(int j=0;j<n;j++){
                if(arr[j][i]==1) t++;
                if(arr[j][i]==0) f++;
            }
            if(t>f) System.out.print((i+1)+" ");//t和f不可能相等，因为好芯片多与坏芯片
        }
    }
}
