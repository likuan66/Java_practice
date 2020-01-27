package lanqiao;

import java.util.Scanner;

/*
    从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
　　      注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
 */

//import java.util.*;
public class BASIC_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int n = s.length();
        char c[] = s.toCharArray();
        long sum = 0;
        for(int i = 0;i<s.length();i++)
        {
            if((int)c[i]-48>9)
            {
                if(c[i] == 'A')
                {
                    sum += 10*Math.pow(16, n-i-1);
                }
                if(c[i] == 'B')
                {
                    sum += 11*Math.pow(16, n-i-1);
                }
                if(c[i] == 'C')
                {
                    sum += 12*Math.pow(16, n-i-1);
                }
                if(c[i] == 'D')
                {
                    sum += 13*Math.pow(16, n-i-1);
                }
                if(c[i] == 'E')
                {
                    sum += 14*Math.pow(16, n-i-1);
                }
                if(c[i] == 'F')
                {
                    sum += 15*Math.pow(16, n-i-1);
                }
            }
            else
            {
                sum += ((int)c[i]-48)*Math.pow(16, n-i-1);
            }
        }
        System.out.println(sum);
    }

}
