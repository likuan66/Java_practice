package biteHomework;

public class lengthOfLastWord {
    public static void main(String[] args) {
        String s="abc cnscnsj";
        System.out.println(lengthOfLastWordString(s));
    }
    public static int lengthOfLastWordString(String s) {
        int length=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                length++;
            }else if(length!=0){
                return length;
            }
        }
        return length;
    }
}
