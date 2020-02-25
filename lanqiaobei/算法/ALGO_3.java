package lanqiao;

import java.util.Arrays;
import java.util.Scanner;

public class ALGO_3{

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        int l=in.nextInt();
        int[][] dp=new int[101][101]; //dp[i][j]表示L位K进制数中第i位数大小为j，这样的i位K进制数中K好数的数目
        Arrays.fill(dp[1], 1);//1位K进制数:目标数最低位依次初始化为0~K - 1，每一个数只出现一次
        for(int i=2;i<=l;i++) {//数的位置，最高位为L，最低位为1
            for(int j=0;j<k;j++) {//逐个找出后面的数字不能与前一个数字相邻的情况有多少种
                for(int m=0;m<k;m++) {
                    if(m!=j-1&&m!=j+1) {
                        dp[i][j]+=dp[i-1][m];
                        dp[i][j]%=1000000007;
                    }
                }
            }
        }
        int count=0;
        for(int i=1;i<k;i++) {//除去最高位为0的情况,L位K进制数中K好数的数目
            count+=dp[l][i];
            count%=1000000007;
        }
        System.out.println(count);
    }

}
