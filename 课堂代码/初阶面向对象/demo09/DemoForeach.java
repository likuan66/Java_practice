package demo08;

import java.util.ArrayList;

/*
    增强for循环：底层使用的也是迭代器，使用for循环格式简化了迭代器的书写
    public  interface Iterable<>实现这个接口允许对象成为“foreach”语句的目标
    增强for循环：用来遍历集合和数组
    格式：
            for（集合/数组的数据类型  变量名：集合名/数组名）{
                sout（变量名）；
            }
 */
public class DemoForeach {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    private static void demo2() {
        ArrayList<String> list=new ArrayList<>();
        list.add("库里");
        list.add("詹姆斯");
        list.add("科比");
        for(String s:list){
            System.out.println(s);
        }
    }

    private static void demo1() {
        int[] arr={1,2,3,4,5};
        for(int i:arr){
            System.out.println(i);
        }
    }

}
