package demo07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDateFromat {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

   private static void demo02() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf.parse("2019年12月20日 17时27分23秒");
    }

    //使用DateFormat类中的方法format，把日期格式变为文本 String format（Date date）
    private static void demo01() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date=new Date();
        String text = sdf.format(date);
        System.out.println(date);
        System.out.println(text);

    }
}
