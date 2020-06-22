package bite每日一题;


import java.util.Scanner;

/*
 输入一个整数，将这个整数以字符串的形式逆序输出
程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 */
public class day13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            String str="";
            while(num!=0){
                int t1=num%10;
                int t2=num/10;
                str=str+String.valueOf(t1);
                num=t2;
            }
            System.out.println(str);
    }
}
