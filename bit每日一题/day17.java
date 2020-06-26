package bite每日一题;

import java.util.Scanner;

/*
美国总统奥巴马不仅呼吁所有人都学习编程，甚至以身作则编写代码，成为美国历史上首位编写计算机代码的总统。
2014年底，为庆祝“计算
机科学教育周”正式启动，奥巴马编写了很简单的计算机代码：在屏幕上画一个正方形。现在你也跟他一起画吧！
 */
public class day17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String c=sc.next();
        int col=(int)Math.round(n/2.0);
        for(int i=0;i<col;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==col-1){
                    System.out.print(c);
                }else{
                    if(j==0||j==n-1){
                        System.out.print(c);
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
