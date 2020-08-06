package 代码专项练习.字符串;

/*
汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，
就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，
请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,
要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
public class LeftRotateStringPractice {
    //方法一：每次左移一个字符，重复移上n次就好了（这次存在重复移，因此要去重）n%=str.length()
//    public String LeftRotateString(String str,int n) {
//        if(str.length()==0||n==0){
//            return str;
//        }
//        n%=str.length();//去重
//        char[] ch=str.toCharArray();
//        while(n!=0){
//            n--;
//            LeftRotateStringHelper(ch);//左移一次
//        }
//        return new String(ch);
//    }
//
//    private void LeftRotateStringHelper(char[] ch) {
//        char temp=ch[0];
//        for(int i=0;i<ch.length-1;i++){
//            ch[i]=ch[i+1];
//        }
//        ch[ch.length-1]=temp;
//    }
    //方法二：局部逆置，再整体逆置
    public String LeftRotateString(String str,int n){
        if(str.length()==0||n==0){
            return str;
        }
        n%=str.length();
        char[] ch=str.toCharArray();
        ReverseString(ch,0,n-1);
        ReverseString(ch, n, ch.length-1);
        ReverseString(ch,0,ch.length-1);
        return new String(ch);
    }

    private void ReverseString(char[] ch, int i, int j) {
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
    }
}

