package lanqiao;

import java.util.Scanner;

/*
    十六进制数是在程序设计时经常要使用到的一种整数的表示方式。
    它有0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F共16个符号，分别表示十进制数的0至15。
    十六进制的计数方法是满16进1，所以十进制数16在十六进制中是10，而十进制的17在十六进制中是11，
    以此类推，十进制的30在十六进制中是1E。
　　      给出一个非负整数，将它表示成十六进制的形式。
 */
public class BASIC_10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        char c;
        String s="";
        if(n==0){
            s="0";
        }
        while(n%16!=0||n/16!=0){
            int m=n%16;
            if(m/10==1) {
                c = (char) (65 + m % 10);
            }else{
                c=(char)(48+m);
            }
            s=c+s;
            n=n/16;
        }
        System.out.println(s);
    }
}
