package bite每日一题;

import java.util.Scanner;

/*
请编写一个函数，将两个数字相加。不得使用+或其他算数运算符。
给定两个int A和B。请返回A＋B的值
 */
public class day19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(addAB(a,b));
    }

    private static int addAB(int a, int b) {
        int m=0;
        int n=0;
        while(b!=0){
            m=a^b;
            n=(a&b)<<1;
            a=m;
            b=n;
        }
        return a;
    }
}
