package demo09;
/*
        set集合存储不重复元素
                前提：存储元素必须重写hashCode方法和equals方法
 */
import java.util.HashSet;

public class DemoHashSet {
    public static void main(String[] args) {
        //创建hashset的集合对象
        HashSet<String> set=new HashSet<>();
        String s1=new String("abc");
        String s2=new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);
    }
}
