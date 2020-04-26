package biteHomework.MyHsahMap;

import java.util.HashMap;

public class firstUniqCharPractice {
    public int firstUniqChar(String s) {
        int[] arr=new int[26];
        char[] c=s.toCharArray();
        for(char ch:c){
            arr[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(arr[c[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
    /*
     public int firstUniqChar_3(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //lastIndexOf（）方法，返回子字符串最后出现的位置。没有找到，则返回 -1。
            //indexOf（）方法返回子字符串第一次出现字符位置。没有找到，则返回 -1。
                if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                    return i;
                }
            }
        return -1;
    }
     */
    /*
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>(26);
        char[] chars=s.toCharArray();
        for(char ch:chars){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(chars[i])==1){
                return i;
            }
        }
        return -1;
    }

     */
}
