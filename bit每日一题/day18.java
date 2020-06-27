package bite每日一题;

import java.math.BigInteger;
import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            BigInteger num1=new BigInteger(s1);
            BigInteger num2=new BigInteger(s2);
            System.out.println(num1.add(num2));
        }
    }
}
