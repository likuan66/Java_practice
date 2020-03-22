package lanqiao;
/*
小明开了一家糖果店。他别出心裁：把水果糖包成4颗一包和7颗一包的两种。糖果不能拆包卖。
小朋友来买糖的时候，他就用这两种包装来组合。当然有些糖果数目是无法组合出来的，比如要买 10 颗糖。
你可以用计算机测试一下，在这种包装情况下，最大不能买到的数量是17。大于17的任何数字都可以用4和7组合出来。
本题的要求就是在已知两个包装的数量时，求最大不能组合出的数字。
 */
import java.util.Scanner;

public class PREV_8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s[] = new int[1000000];
        for (int i = 0; i < a * b; i++) {
            for (int j = 0; j < a * b; j++) {
                if (a * i + b * j >= 1000000)//超过数组范围时退出
                    break;
                s[a * i + b * j]++;
            }
        }
        int k = 0;
        for (int i = a * b - 1; i >= 0; i--)
            if (s[i] == 0) {
                k = i;
                break;
            }
        System.out.println(k);
    }
}
