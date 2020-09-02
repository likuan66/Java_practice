package 算法;

import java.util.ArrayList;
import java.util.Collections;

/*
输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class PermutationPractice {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result=new ArrayList<>();
        if(str!=null&&str.length()>0){
            PermutationHelper(str.toCharArray(),0,result);
            Collections.sort(result);
        }
        return result;
    }

    private void PermutationHelper(char[] str, int start, ArrayList<String> result) {
        if(start==str.length-1){
            if(!IsExist(result,str)){
                result.add(new String(str));
            }
            return;
        }
        for(int i=start;i<str.length;i++){
            Swap(str,start,i);
            PermutationHelper(str,start+1,result);
            Swap(str,start,i);
        }
    }

    private void Swap(char[] str, int start, int i) {
        char temp=str[i];
        str[i]=str[start];
        str[start]=temp;
    }

    private boolean IsExist(ArrayList<String> result, char[] str) {
        return result.contains(String.valueOf(str));
    }
}
