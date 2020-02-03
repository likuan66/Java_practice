package lanqiao;

import java.util.Scanner;

/*
         龟兔赛跑预测
 */
public class BASIC_24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int v1=scanner.nextInt();
        int v2=scanner.nextInt();
        int t=scanner.nextInt();
        int s=scanner.nextInt();
        int l=scanner.nextInt();
        int s1=0,s2=0,i=0;//s1和s2分别表示兔子和乌龟运行的距离i表示时间
        while(s1<l&&s2<l){
            s1+=v1;
            s2+=v2;
            i++;
            if(s1==l||s2==l){
                break;
            }
            if(s1-s2>=t){
                s1-=v1*s;
            }
        }
        if(s1>s2){
            System.out.println("R");
        }else if(s1<s2){
            System.out.println("T");
        }else{
            System.out.println("D");
        }
        System.out.println(i);
    }
}
