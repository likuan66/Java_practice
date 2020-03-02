package lanqiao;
import java.util.Scanner;
/*
    输入一个实数x，求最小的n使得，1/2+1/3+1/4+...+1/(n+1)>=x。
　　输入的实数x保证大于等于0.01，小于等于5.20，并且恰好有两位小数。
    你的程序要能够处理多组数据，即不停地读入x，如果x不等于0.00，则计算答案，否则退出程序。
　　输出格式为对于一个x，输出一行n card(s)。其中n表示要计算的答案
 */
public class ALGO_45 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            double x=sc.nextDouble();;
            int i; double k,s;
            while(x!=0){
                s=0;
                for(i=2;;i++){
                    k=1.0/i;
                    s+=k;
                    if(s>=x){
                        System.out.println((i-1)+" "+"card(s)");
                        break;
                    }
                }
                x=sc.nextDouble();
            }
        }
}
