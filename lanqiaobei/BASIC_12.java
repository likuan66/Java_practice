package lanqiao;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class BASIC_12{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String arr[] = new String[n];
        for(int i = 0;i < n;i++) {
            arr[i] = input.next();
        }
        for(int i = 0;i < arr.length;i++) {
            String s = HextoOct(arr[i]);
            System.out.println(s.replaceFirst("0", ""));//使用给定的参数 replacement 替换字符串第一个匹配给定的正则表达式的子字符串。
        }
    }

    private static String HextoOct(@NotNull String s) {
        StringBuffer s1=new StringBuffer("");
        //十六进制转二进制
        for(int i=0;i<s.length();i++) {
            switch(s.charAt(i)) {//charAt(int index)用来检索特定索引下的字符的String实例.
                case '0':s1.append("0000");break;
                case '1':s1.append("0001");break;
                case '2':s1.append("0010");break;
                case '3':s1.append("0011");break;
                case '4':s1.append("0100");break;
                case '5':s1.append("0101");break;
                case '6':s1.append("0110");break;
                case '7':s1.append("0111");break;
                case '8':s1.append("1000");break;
                case '9':s1.append("1001");break;
                case 'A':s1.append("1010");break;
                case 'B':s1.append("1011");break;
                case 'C':s1.append("1100");break;
                case 'D':s1.append("1101");break;
                case 'E':s1.append("1110");break;
                case 'F':s1.append("1111");break;
            }

        }
        s = s1.toString();
        //字符的长度如果不能整除3，则需要在转换的结果前补0；
        if (s.length()%3 == 1)
            s = "00"+s;
        else if(s.length()%3 == 2)
            s = "0"+s;

        StringBuffer s2 =new StringBuffer("");
        //二进制转八进制
        for(int i = 0;i < s1.length();i+=3) {
            String str = s.substring(i, i+3);//substring(x,y）是从x到y前的位置停止
            switch(str) {
                case "000":s2.append('0');break;
                case "001":s2.append('1');break;
                case "010":s2.append('2');break;
                case "011":s2.append('3');break;
                case "100":s2.append('4');break;
                case "101":s2.append('5');break;
                case "110":s2.append('6');break;
                case "111":s2.append('7');break;
            }
        }
        return s2.toString();
    }
}
