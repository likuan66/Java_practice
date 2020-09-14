package 算法;

import java.util.Set;
/*
 给定一个字符串s和一组单词dict，判断s是否可以用空格分割成一个单词序列，使
 得单词序列中所有的单词都是dict中的单词（序列可以包含一个或多个单词）。
例如:
给定s=“leetcode”；
dict=["leet", "code"].
返回true，因为"leetcode"可以被分割成"leet code".
 */
public class wordBreakPractice {
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] booleans=new boolean[s.length()+1];
        booleans[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=i-1;j>=0;j--){
                if(booleans[j]&&dict.contains(s.substring(j,i))){
                    booleans[i]=true;
                    break;
                }
            }
        }
        return booleans[s.length()];
    }
}
