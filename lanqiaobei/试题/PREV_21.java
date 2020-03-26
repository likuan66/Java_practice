package lanqiao;

import java.util.Scanner;

public class PREV_21{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt=0;
        boolean flag=false;
        for(int i=10000;i<=99999;i++){
            int a = i%10;
            int b = i/10%10;
            int c = i/100%10;
            int d = i/1000%10;
            int e = i/10000%10;
            if(a==e&&b==d&&a+b+c+d+e==n){
                cnt++;
                System.out.println(i);
                flag=true;
            }
        }
        for(int i=100000;i<=999999;i++){
            int a = i%10;
            int b = i/10%10;
            int c = i/100%10;
            int d = i/1000%10;
            int e = i/10000%10;
            int f = i/100000%10;
            if(a==f&&b==e&&c==d&&a+b+c+d+e+f==n){
                cnt++;
                System.out.println(i);
                flag=true;
            }
        }
        if(flag==false){
            System.out.println(-1);
        }
    }
}