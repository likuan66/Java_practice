package bite每日一题;

import java.util.Scanner;


public class day04 {
    /*
    有一个神奇的口袋，总的容积是40，用这个口袋可以变出一些物品，这些物品的总体积必须是40。
    John现在有n个想要得到的物品，每个物品的体积 分别是a1，a2……an。John可以从这些物品
    中选择一些，如果选出的物体的总体积是40，那么利用这个神奇的口袋，John就可以得到这些物品。
    现在的问题 是，John有多少种不同的选择物品的方式
     */
    static int count;
    static int[] arr;
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            n=sc.nextInt();
            if(n>=1&&n<=20) {
                arr = new int[n+1];
                for (int i = 1; i <= n; i++) {
                    arr[i] = sc.nextInt();
                }
                Count(40,n);
                System.out.println(count);
            }
        }
    }

    public static void Count(int s, int n) {
        if(s==n){
            ++count;
            return;
        }
        if(s<0||(s>0&&n<1)){
            return;
        }
        Count(s-arr[n],n-1);
        Count(s,n-1);
    }

}
