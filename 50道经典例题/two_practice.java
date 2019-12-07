package Java_practice;
/*题目：判断101-200之间有多少个素数，并输出所有素数。*/
import java.util.Scanner;
public class two_practice {
    public static void main(String[] args) {
        boolean flag;
        int count=0;
        for(int i=101;i<=200;i++)
        {
            flag=false;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("101到200之间共有"+count+"素数");
    }
}
