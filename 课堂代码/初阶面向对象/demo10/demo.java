package demo09;

import java.util.Scanner;
import java.lang.Math;

public class demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String n=scanner.nextLine();
        char[] arr=n.toCharArray();
        int sum=0;
        for(int i=0;i<arr.length;i++){
             sum+=(arr[i]-48)*Math.pow(2,arr.length-1-i);
        }
        System.out.println(sum);
    }
}
