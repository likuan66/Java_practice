package biteHomework;

public class toLowerCase {
    public static void main(String[] args) {
        String str="abcdeFG";
        String s=toLowerCaseString(str);
        System.out.println(s);
    }

    public static String toLowerCaseString(String str) {
        String result="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>=65&&c<=90){
                c+=32;
            }
            result+=c;
        }
        return result;
    }
}
