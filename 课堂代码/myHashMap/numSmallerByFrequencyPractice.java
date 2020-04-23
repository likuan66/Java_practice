package biteHomework.MyHsahMap;

import java.util.Arrays;

public class numSmallerByFrequencyPractice {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] res=new int[queries.length];
        int[] target=new int[words.length];
        for(int i=0;i<words.length;i++){
            target[i]=f(words[i]);
        }
        Arrays.sort(target);
        for(int i=0;i<queries.length;i++){
            int queryNum=f(queries[i]);
            res[i]=binarySearch(queryNum,target);
        }
        return res;
    }

    private int binarySearch(int queryNum, int[] target) {
        int left=0;
        int right=target.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(target[mid]>queryNum){
                mid=right;
            }else{
                left=mid;
            }
        }
        if(target[left]<=queryNum){
            return 0;
        }else{
            return target.length-left;
        }

    }

    private int f(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int[] char_num=new int[26];
        char[] chars=s.toCharArray();
        for(char ch:chars){
            char_num[ch-'a']++;
        }
        for(int num:char_num){
            if(num>0){
                return num;
            }
        }
        return 0;
    }
}
