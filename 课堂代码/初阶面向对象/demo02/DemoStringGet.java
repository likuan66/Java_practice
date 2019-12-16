package demo1;

public class DemoStringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int length="dajnjanssansnjnns".length();
        System.out.println("字符串的长度是："+length);
        System.out.println("=========================");
        //拼接字符串
        String str1="Hello";
        String str2="word";
        String str3=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("=========================");
        //获取指定位置的单个索引位置
        char ch="hello".charAt(1);
        System.out.println(ch);
        System.out.println("=========================");
        //查找参数字符串在本来字符串当中出现的第一次索引位置，如果没有则返回值-1
        String orginal="helloword";
        int dex=orginal.indexOf("llo");
        System.out.println(dex);
        System.out.println("=========================");
        //截取字符串从索引位置到最后
        String s1="helloword";
        String s2=s1.substring(5);
        System.out.println(s1);//helloword原封不动
        System.out.println(s2);
        System.out.println("=========================");
        //截取字符串substring（x，y）中包含两个参数[x,y)
        String s3=s1.substring(3,6);
        System.out.println(s3);
        System.out.println("=========================");
        /*
        下面这种写法字符串的内容仍然没有改变，
        strA当中保存的是地址值
        本来的地址值是hello的0x666
        后来地址值变为word的0x999
        */
        String strA="hello";
        System.out.println(strA);
        strA="word";
        System.out.println(strA);
    }
}
