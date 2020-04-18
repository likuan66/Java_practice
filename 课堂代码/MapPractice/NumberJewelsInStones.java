package biteHomework.MapPractice;

import java.util.HashSet;
import java.util.Set;

public class NumberJewelsInStones {
    public int numJewelsInStones(String J, String S){
        //1.先遍历j把所有的宝石类型加入到一个set中
        Set<Character> set=new HashSet<>();
        for(char c:J.toCharArray()){
            set.add(c);
        }
        //2.遍历S拿到每个元素取set中查找，如果能找到就说明是宝石
        int ret=0;
        for(char c:S.toCharArray()){
            if(set.contains(c)){
                ret++;
            }
        }
        return ret;
    }
}
