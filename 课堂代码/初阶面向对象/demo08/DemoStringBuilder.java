package demo07;

/*
    java.lang.StringBuilder类：字符串缓冲区，可以提高字符串的效率
    构造方法：
        public StringBuilder();构造一个空的StingBuilder容器
        public StringBuilder(String[] args);构造一个StringBuilder容器，并将字符串添加进去
     StringBuilder类的成员方法：
        public StringBuilder append(...);添加任意类型的字符串形式，并返回当前自身

 */
public class DemoStringBuilder {
    public static void main(String[] args) {
        StringBuilder bu1=new StringBuilder();
        System.out.println("bu1:"+bu1);
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:"+bu2);
        System.out.println("===========================");
        StringBuilder bu3 = new StringBuilder();
        //使用append方法StringBuilder中添加数据
        //append方法的返回的是this，调用的方法是bu3
        StringBuilder bu4 = bu3.append("abc");
        System.out.println(bu3);
        System.out.println(bu4);
        System.out.println(bu3==bu4);
        System.out.println("=========================");
        //使用append方法无需接受返回值
        StringBuilder bu5=new StringBuilder();
        bu5.append("abc");
        System.out.println(bu5);
        //还可以使用链式
        StringBuilder bu6=new StringBuilder();
        bu6.append("a").append("b").append("c");
        System.out.println(bu6);
        //reverse是将字符串做题翻转
        bu6.reverse();
        System.out.println(bu6);
    }
}
