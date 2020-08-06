package 代码专项练习.字符串;

import java.util.HashMap;
import java.util.Map;

/*
给定两个字符串 s 和 t，判断它们是否是同构的。
如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
输入: s = "egg", t = "add"
输出: true
 */
public class isIsomorphicPractice {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){//如果没有此字符就添加
                if(map.containsValue(t.charAt(i))){//如果在i位置key中没有此字符，而value中有此字符 就出错
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }else{//如果有重复的字符可以通过get方法获取以前的value值 看是否与此时的t.charAt(i)相同
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
