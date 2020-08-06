package 代码专项练习.字符串;

import java.util.HashMap;
import java.util.Map;

//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//输入: s = "anagram", t = "nagaram"
//输出: true
public class isAnagramPractice {
//    public boolean isAnagram(String s, String t) {
//        if(s.length()!=t.length()){
//            return false;
//        }
//        int[] a=new int[26];
//        for(int i=0;i<s.length();i++){
//            a[s.charAt(i)-'a']++;
//            a[t.charAt(i)-'a']--;
//        }
//        for(int i=0;i<a.length;i++){
//            if(a[i]!=0){
//                return false;
//            }
//        }
//        return true;
//    }
    public boolean isAnagram(String s, String t){
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            //map.getOrDefault(ch,0)map中如果没有此字符 默认值为0，如果有的话得到其数目
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            Integer count=map.get(ch);
            if(count==null){
                return false;
            }else if(count>1){
                map.put(ch,count-1);
            }else{
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }
}
