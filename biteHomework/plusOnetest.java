package day04;

import java.util.Arrays;

public class plusOnetest {
    public static void main(String[] args) {
        int[] arr={1,2,9};
       int[] a=plusOne(arr);
        System.out.println(Arrays.toString(a));
    }
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] temp=new int[digits.length+1];
        temp[0]=1;
        return temp;
    }
}
