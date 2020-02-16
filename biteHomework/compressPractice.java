package day05;

public class compressPractice {
    public static void main(String[] args) {
        char[] arr={'a','a','b','b','c','c','c'};
        System.out.println(compress(arr));
    }
    public static int compress(char[] chars) {
        int len=chars.length;
        if(len<=1){
            return len;
        }
        int count=0,i=0,j=1,curr=-1;
        while(j<=len){
            if(j!=len&&chars[i]==chars[j]){
                count++;
                j++;
            }
            if(j==len||chars[i]!=chars[j]){
                chars[++curr]=chars[i];
                if(curr+1<=len-1&&count!=0){
                    for(char t:((count+1)+"").toCharArray()){
                        chars[++curr]=t;
                    }
                }
                i=j;
                j++;
                count=0;
            }
        }
        return curr+1;
    }
}
