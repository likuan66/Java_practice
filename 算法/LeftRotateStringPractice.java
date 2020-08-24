package 算法;

public class LeftRotateStringPractice {
    //方法一：保存第一个，剩下的整体前移一个，第一个放在最后，完成一次移动，一次能移动，多次也可以
//    public String LeftRotateString(String str,int n) {
//        if(str.length()==0||n==0){
//            return str;
//        }
//        n%=str.length();
//        char[] ch=str.toCharArray();
//        while(n>0){
//            n--;
//            LeftRotateStringhelper(ch);
//        }
//        return new String(ch);
//    }
//
//    private void LeftRotateStringhelper(char[] ch) {
//        char temp=ch[0];
//        int i=0;
//        for(;i<ch.length-1;i++){
//            ch[i]=ch[i+1];
//        }
//        ch[i]=temp;
//    }
    //方法二:局部逆置，在整体逆置
    public String LeftRotateString(String str,int n){
        if(str.length()==0||n==0){
            return str;
        }
        n%=str.length();
        char[] ch=str.toCharArray();
        Reverse(ch,0,n-1);
        Reverse(ch,n,str.length()-1);
        Reverse(ch,0,str.length()-1);
        return new String(ch);
    }

    private void Reverse(char[] ch, int x, int y) {
        while(x<y){
            char temp=ch[x];
            ch[x]=ch[y];
            ch[y]=temp;
            x++;
            y--;
        }
    }
}
