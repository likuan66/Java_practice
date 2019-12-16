package demo1;

public class DemoStringConvet {
    public static void main(String[] args) {
        //转换为字符数组
        char[] chars="helloword".toCharArray();
        System.out.println(chars.length);
        //转换为字节数组
        byte[] bytes="abc".getBytes();
        for(int i=0;i<bytes.length;i++){
            System.out.println(bytes[i]);
        }
        //字符串中字符的替换
        String str1="how do you do";
        String str2=str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);
        //分割字符串如果要用split函数进行字符串的切割的话
        //注意：如果按照英文句点"."进行切割，必须写"\\."(两个反斜杠)
        String s1="aaa,bbb,ccc";
        String[] array = s1.split(",");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        //如果要用split函数进行字符串的切割的话
        //注意：如果按照英文句点"."进行切割，必须写"\\."(两个反斜杠)
        String s2="xxx.yyy.zzz";
        String[] array1 = s2.split("\\.");
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
    }
}
