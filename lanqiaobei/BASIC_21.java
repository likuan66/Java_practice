package lanqiao;

import java.util.Scanner;

/*
     最近FJ为他的奶牛们开设了数学分析课，FJ知道若要学好这门课，必须有一个好的三角函数基本功。
     所以他准备和奶牛们做一个“Sine之舞”的游戏，寓教于乐，提高奶牛们的计算能力。
　　  不妨设
　　  An=sin(1–sin(2+sin(3–sin(4+...sin(n))...)
　　  Sn=(...(A1+n)A2+n-1)A3+...+2)An+1
　　  FJ想让奶牛们计算Sn的值，请你帮助FJ打印出Sn的完整表达式，以方便奶牛们做题。
 */
public class BASIC_21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        printS(n,n+1);
        System.out.println();
    }

    private static void printS(int n, int i) {
        if(n==1){
            printA(1,n);
            System.out.print("+"+(i-n));
        }else{
            System.out.print("(");
            printS(n-1,i);
            System.out.print(")");
            printA(1,n);
            System.out.print("+"+(i-n));
        }
    }

    private static void printA(int i, int n) {
        if(i==n){
            System.out.print("sin("+i+")");
        }else{
            System.out.print("sin("+i);
            if(n%2==0) {
                System.out.print("+");
            }else{
                System.out.print("-");
            }
            printA(i+1,n);
            System.out.print(")");
        }
    }
}
