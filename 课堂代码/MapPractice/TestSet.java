package biteHomework.MapPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        //实例化set
        Set<String> set=new HashSet<>();
        set.add("hello");
        set.add("word");
        //判断是否存在
        System.out.println(set.contains("hello"));
        set.remove("word");
        System.out.println(set.contains("word"));
        //迭代器迭代
        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext()){
            String next=iterator.next();
            System.out.println(next);
        }
    }
}
