package bite每日一题;

import java.util.Scanner;

/*
    正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，
    设计一个算法，求输入A和B的最小公倍数。
 */
public class day09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(n*m/Maxyue(n,m));
    }

    private static int Maxyue(int a, int b) {
        if(b==0){
            return a;
        }
        return Maxyue(b,a%b);
    }
}
