package 算法;

import java.util.ArrayList;
import java.util.Collections;

public class getPermutationPractice {
    public String getPermutation(int n, int k) {
        ArrayList<String> result=new ArrayList<>();
        String s="";
        for(int i=1;i<=n;i++){
            s+=i;
        }
        if(n>0){
            getPermutationHelper(s.toCharArray(),0,result,k);

        }
        Collections.sort(result);
        return result.get(k-1);
    }
    public void getPermutationHelper(char[] ch,int start,ArrayList<String> result,int k){
        if(start==ch.length-1){

            result.add(String.valueOf(ch));
            return;
        }
        for(int i=start;i<ch.length;i++){
            swap(ch,i,start);
            getPermutationHelper(ch,start+1,result,k);
            swap(ch,i,start);
            if(start==0&&result.size()>=k){
                break;
            }
        }
    }
    public void swap(char[] ch,int x,int y){
        char temp=ch[x];
        ch[x]=ch[y];
        ch[y]=temp;
    }

    public static void main(String[] args) {
        getPermutationPractice get=new getPermutationPractice();
        String s=get.getPermutation(4,9);
        System.out.println(s);
    }
}
