package lanqiao;

import java.util.Scanner;


public class ALGO_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int i, j;
        for (i = 0; i < n; i++)
            for (j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        for (i = 0; i < n; i++)
            for (j = 0; j < m; j++)
                a[i][j] += sc.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j < m - 1; j++)
                System.out.print(a[i][j] + " ");
            System.out.println(a[i][j]);
        }
    }

}

