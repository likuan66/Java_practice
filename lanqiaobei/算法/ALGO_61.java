package lanqiao;

import java.util.Scanner;
public class ALGO_61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>=0&&x<=100000000) {
            if (isOdd(x)) {
                System.out.println("odd");
            } else {
                System.out.println("even");
            }
        }else {
            return;
        }
    }
    public static boolean isOdd(int m){
        if(m%2==1){
            return true;
        }else{
            return false;
        }
    }
}
