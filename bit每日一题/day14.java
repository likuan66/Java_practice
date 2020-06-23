package bite每日一题;

import java.util.Scanner;

/*
给定一个k位整数N = dk-1*10k-1 + ... + d1*101 + d0
(0<=di<=9, i=0,...,k-1, dk-1>0)，请编写程序统计每种
不同的个位数字出现的次数。例如：给定N = 100311，则有2个0，3个1，和1个3。
 */
public class day14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        String n = in.next();
        for(int i = 0;i<n.length();i++)
            a[n.charAt(i)-'0']++;
        for(int i = 0;i<a.length;i++)
            if(a[i]!=0)
                System.out.println(i+":"+a[i]);
    }
}
