package demo08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoIterator {
    public static void main(String[] args) {
        //使用多态创建对象
        Collection<String> coll = new ArrayList<String>();
        //添加元素到集合
        coll.add("库里");
        coll.add("詹姆斯");
        coll.add("科比");
        //遍历，使用迭代器遍历  每个集合对象都有自己的迭代器
        Iterator<String> it=coll.iterator();
        //泛型指的是 迭代出 元素的数据类型
        while(it.hasNext()){  //判断是否有迭代元素
            String s=it.next();//获取迭代出的元素
            System.out.println(s);
        }

    }
}
