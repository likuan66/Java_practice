package demo07;

import java.util.Date;

public class DemoDate {
    public static void main(String[] args) {
        demo();
        System.out.println("=====================");
        demo1();
        System.out.println("=====================");
        demo02();
    }

    private static void demo02() {
        Date d2=new Date();
        long time = d2.getTime();  //将当前日期转化为毫秒形式
        System.out.println(time);
    }

    private static void demo(){
        Date date=new Date();
        System.out.println(date);
    }

    private static void demo1(){
        Date d1=new Date(0L);  //传递毫秒值，把毫秒值转换为日期
        System.out.println(d1);

    }
}
