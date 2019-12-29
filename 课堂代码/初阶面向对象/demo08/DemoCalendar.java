package demo07;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.CancellationException;

public class DemoCalendar {

    public static void main(String[] args) {
          /*
            public int get(int field);返回给定日历字段
            参数：传递指定的日历字段
            返回值：日历字段代表具体的值
         */
        demo01();
        /*
            public void set(int field,int value);将给定的日历字段设置为给定的值
            参数：
                int field：传递指定的日历字段
                int value:传递字段设置的具体的值
         */

        demo02();
        /*
            public abstract void add(int field,int amout);根据日历的规则，给定的日历字段添加或减去指定的时间量
            把给定的字段增加/减少指定的值
            参数：
                int field:传递指定的日历字段
                int amout:增加或者减少的值
                        正数：增加
                        负数：减少
         */
        demo03();
        /*
            public Date getTime();返回一个表示此Calendar时间的值（从历元到现在的毫秒偏移量）的Date对象
            把日历对象转换为日期对象
         */
        demo4();
    }

    private static void demo4() {
        //使用getInstance方法获取Canlendar
        Calendar c = Calendar.getInstance();
        Date date=c.getTime();
        System.out.println(date);
    }

    private static void demo03() {
        //使用getInstance方法获取Canlendar
        Calendar c = Calendar.getInstance();
        //将年增加两年
        c.add(Calendar.YEAR,2);
        int year = c.get(Calendar.YEAR);//获取年
        System.out.print(year+"年");
        int month = c.get(Calendar.MONTH);//获取月 西方的月份是0-11，东方的月份是1-12
        System.out.print(month+"月");
        int day = c.get(Calendar.DATE);//获取日
        System.out.print(day+"日 ");
        int hour = c.get(Calendar.HOUR);//获取小时
        System.out.print(hour+":");
        int minute = c.get(Calendar.MINUTE);//获取分钟
        System.out.print(minute+":");
        int seconed = c.get(Calendar.SECOND);//获取秒
        System.out.println(seconed);
    }

    private static void demo02() {
        //使用getInstance方法获取Canlendar
        Calendar c = Calendar.getInstance();
        //设置值年为9999
        c.set(Calendar.YEAR,9999);//单个设置
        //c.set(9999,22,22);多个设置
        int year = c.get(Calendar.YEAR);//获取年
        System.out.print(year+"年");
        int month = c.get(Calendar.MONTH);//获取月 西方的月份是0-11，东方的月份是1-12
        System.out.print(month+"月");
        int day = c.get(Calendar.DATE);//获取日
        System.out.print(day+"日 ");
        int hour = c.get(Calendar.HOUR);//获取小时
        System.out.print(hour+":");
        int minute = c.get(Calendar.MINUTE);//获取分钟
        System.out.print(minute+":");
        int seconed = c.get(Calendar.SECOND);//获取秒
        System.out.println(seconed);

    }

    private static void demo01() {
        //使用getInstance方法获取Canlendar
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);//获取年
        System.out.print(year+"年");
        int month = c.get(Calendar.MONTH);//获取月 西方的月份是0-11，东方的月份是1-12
        System.out.print(month+"月");
        int day = c.get(Calendar.DATE);//获取日
        System.out.print(day+"日 ");
        int hour = c.get(Calendar.HOUR);//获取小时
        System.out.print(hour+":");
        int minute = c.get(Calendar.MINUTE);//获取分钟
        System.out.print(minute+":");
        int seconed = c.get(Calendar.SECOND);//获取秒
        System.out.println(seconed);
    }
}
