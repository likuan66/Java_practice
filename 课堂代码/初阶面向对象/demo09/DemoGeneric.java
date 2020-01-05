package demo08;

import java.util.ArrayList;
import java.util.Iterator;

/*
    泛型的通配符：
        ？：代表任意地数据类型
    使用方式：
         不能创建的对象使用
         只能最为方法的参数使用
 */
public class DemoGeneric {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        ArrayList<String> list1=new ArrayList<>();
        list1.add("a");
        list1.add("b");
        printArray(list);
        printArray(list1);
    }
    public static void printArray(ArrayList<?> list){
        //使用迭代器遍历集合
        Iterator<?> it=list.iterator();
        while(it.hasNext()){
            //it.next()方法，去除的元素是Object，可以接受任意类型的数据类型
            Object o=it.next();
            System.out.println(o);
        }
    }
}
