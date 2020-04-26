package biteHomework.MyHsahMap;

public class findTheDifferencePractice {
    public static char findTheDifference(String s, String t) {
        int sum = 0;
        for (char c : t.toCharArray())
            sum += c;
        for (char c : s.toCharArray())
            sum -= c;
        return (char) sum;
    }

    public static void main(String[] args) {
        String s="abcd";
        String t="abcde";
        char c=findTheDifference(s,t);
        System.out.println(c);
    }
}
