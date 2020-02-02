package lanqiao;

import java.util.Scanner;

/*
        　FJ在沙盘上写了这样一些字符串：
　　      A1 = “A”
　　      A2 = “ABA”
　　      A3 = “ABACABA”
　　      A4 = “ABACABADABACABA”
　　      … …
　　      你能找出其中的规律并写所有的数列AN吗？
 */
public class BASIC_22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        f(n-1);
        System.out.println();
    }

    private static void f(int i) {
        if(i==0){
            System.out.print("A");
        }else{
            f(i-1);
            System.out.print((char)(i+'A'));
            f(i-1);
        }
    }
}
