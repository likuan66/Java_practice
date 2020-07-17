package 算法.常见的字符串算法;


/*
给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
在构造过程中，请注意区分大小写。比如"Aa"不能当做一个回文字符串。注 意:假设字符串的长度不会超过 1010。
回文串：“回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串
 */
public class 最长回文串 {
    public static String longestPalindrome(String s){
        String result="";
        int max=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                String str=s.substring(i,j+1);
                if(isPalindromic(str)&&str.length()>max){
                    result=str;
                    max=j-i;
                }
            }
        }
        return result;
    }
    public static boolean isPalindromic(String s){
        int len=s.length();
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
