package 每日一题;

import java.util.HashSet;
import java.util.Set;

/*
给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
回文串不一定是字典当中的单词。
 */
public class day03 {
    public static boolean canPermutePalindrome(String s) {
        if(s==null){
            return false;
        }
        char[] chars=s.toCharArray();
        Set<Character> set=new HashSet<>();
        for(char ch:chars){
            if(set.contains(ch)){
                set.remove(ch);
            }else{
                set.add(ch);
            }
        }
        return set.size()<=1;
    }

    public static void main(String[] args) {
        String s="tactcoa";
        System.out.println(canPermutePalindrome(s));
    }
}
