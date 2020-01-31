package lanqiao;

import java.util.Scanner;

/*
给定一个N阶矩阵A，输出A的M次幂（M是非负整数）
　　例如：
　　A =
　　1 2
　　3 4
　　A的2次幂
　　7 10
　　15 22
 */
public class BASIC_17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[][] arr=new int[n][n];
        int[][] r=new int[n][n];
        int[][] t=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<n;i++){
                r[i][i] = 1;
        }

        while(m-->0){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    for(int k=0;k<n;k++){
                        t[i][j] += r[i][k]*arr[k][j];
                    }
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    r[i][j]=t[i][j];
                    t[i][j] = 0;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(r[i][j]+" ");
            }
            System.out.println();
        }
    }
}
