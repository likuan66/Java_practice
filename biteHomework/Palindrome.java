package biteHomework;

public class Palindrome {
    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int right=0,y=0;
        int left=x;
        while(left!=0){
            right=left%10;
            y=y*10+right;
            left=left/10;
        }
        return x==y;
    }
}
