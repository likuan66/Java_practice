package lanqiao;

import java.util.Scanner;

public class PREV_1 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int i=1;
            while(i<=a*b*c)
            {
                if(i%a==0&&i%b==0&&i%c==0)
                {
                    System.out.println(i);
                    break;
                }
                else
                    i++;
            }
        }
}
