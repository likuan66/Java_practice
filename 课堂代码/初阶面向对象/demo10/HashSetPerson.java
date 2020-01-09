package demo09;

import java.util.HashSet;
/*
        hashset存储自定义类型元素
            必须重写hashCode和equals方法

 */
public class HashSetPerson {
    public static void main(String[] args) {
        //创建hashset的集合存储Person
        HashSet<Person> set=new HashSet<>();
        Person s1=new Person("小美女",18);
        Person s2=new Person("小美女",18);
        Person s3=new Person("小美女",19);
        System.out.println(s1.hashCode());// 1967205423
        System.out.println(s2.hashCode());//42121758

        System.out.println(s1.equals(s2));//false

        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
    }
}
