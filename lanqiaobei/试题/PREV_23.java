package lanqiao;

import java.util.Scanner;

public class PREV_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long t = sc.nextLong();
        long num = 1;// 栋栋说的数
        long sum = 1;// 说的数的总和
        long d = (n + 1) * n / 2;// 说的第一个数和第二个数的间隔
        for (int i = 1; i < t; i++) {
            num += d;
            d += n * n;
            if (num >= k)
                num %= k;
            sum += num;
        }
        System.out.println(sum);

    }
}

