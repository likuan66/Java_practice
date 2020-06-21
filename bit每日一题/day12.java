package bite每日一题;

import java.util.Scanner;

public class day12 {
    //【末尾0的个数】输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int count=0;
            for(int i=n;i>=5;i--){
                int temp=i;
                while(temp%5==0){
                    count++;
                    temp/=5;
                }
            }
            System.out.println(count);
        }
    }
}
