package lanqiao;

import java.util.Scanner;

//已知一个正整数N，问从1~N中任选出三个数，他们的最小公倍数最大可以为多少。
public class ALGO_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=2){
            System.out.println(n);
        }
        if(n>2){
            if(n%2==1){
                System.out.println(n*(n-1)*(n-2));
            }
            if(n%2==0&&n%3!=0){
                System.out.println(n*(n-1)*(n-3));
            }
            if(n%2==0&&n%3==0){
                System.out.println((n-1)*(n-2)*(n-3));
            }
        }
    }
}
