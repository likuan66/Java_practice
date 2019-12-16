package demo1;
import java.util.Scanner;
/*
题目：键盘输入一个字符串，并且统计出各种字符出现的次数
种类有：大写字母，小写字母，数字，其他
 */
public class DemoStringCount {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        int countUpper=0;//大写
        int countLower=0;//小写
        int countNumber=0;//数字
        int countOther=0;//其他
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            if(ch>='a'&&ch<='z'){
                countLower++;
            }else if(ch>='A'&&ch<='Z'){
                countUpper++;
            }else if(ch>='0'&&ch<='9'){
                countNumber++;
            }else{
                countOther++;
            }
        }
        System.out.println("大写字母有"+countUpper+"个");
        System.out.println("小写字母有"+countLower+"个");
        System.out.println("数字有"+countNumber+"个");
        System.out.println("其他字符有"+countOther+"个");
    }
}
