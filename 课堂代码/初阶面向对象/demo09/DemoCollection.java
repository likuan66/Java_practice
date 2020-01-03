package demo08;

import java.util.ArrayList;
import java.util.Collection;

/*
    public boolean add(E e) ： 把给定的对象添加到当前集合中 。
    public void clear() :清空集合中所有的元素。
    public boolean remove(E e) : 把给定的对象在当前集合中删除。
    public boolean contains(E e) : 判断当前集合中是否包含给定的对象。
    public boolean isEmpty() : 判断当前集合是否为空。
    public int size() :返回集合中元素的个数。
    public Object[] toArray() : 把集合中的元素，存储到数组中。
 */
public class DemoCollection {
    public static void main(String[] args) {
        //创建集合对象  使用多态的形式
        Collection<String> coll=new ArrayList<String>();
        //boolean add(E e) ： 把给定的对象添加到当前集合中 。
        coll.add("hello");
        coll.add("word");
        System.out.println(coll);
        //void clear() :清空集合中所有的元素。
        coll.clear();
        System.out.println(coll);
        //boolean remove(E e) : 把给定的对象在当前集合中删除。
        coll.remove("hello");
        System.out.println(coll);
        //boolean contains(E e) : 判断当前集合中是否包含给定的对象。
        System.out.println(coll.contains("word"));
        //boolean isEmpty() : 判断当前集合是否为空。
        System.out.println(coll.isEmpty());
        //int size() :返回集合中元素的个数。
        System.out.println(coll.size());
        //Object[] toArray() : 把集合中的元素，存储到数组中。
        Object[] arr=coll.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
