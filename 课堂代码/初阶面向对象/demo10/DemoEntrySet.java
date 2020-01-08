package demo09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
        Map集合遍历的第二种方式：使用entry对象遍历
        Map集合中的方法
            Set<Map.Entry<k,v>> entrySet()返回此映射中包含的映射关系的set视图
        实现步骤：
                1.使用Map集合中的方法entrySet（）方法，把Map集合中多个Entry对象取出来，存到一个set集合中
                2.遍历set集合，获取每一个Entry对象
                3.使用Entry对象中的方法getKey()和getValue()获取键与值
 */
public class DemoEntrySet {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("库里",196);
        map.put("詹姆斯",202);
        map.put("科比",199);
        //1.使用Map集合中的方法entrySet（）方法，把Map集合中多个Entry对象取出来，存到一个set集合中
        Set<Map.Entry<Object, Object>> set = map.entrySet();
       // 2.遍历set集合，获取每一个Entry对象
        //使用迭代器遍历集合set
        Iterator<Map.Entry<Object, Object>> it = set.iterator();

        while(it.hasNext()){
            Map.Entry<Object, Object> entry = it.next();
            //3.使用Entry对象中的方法getKey()和getValue()获取键与值

            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+"="+value);
        }
        for(Map.Entry<Object, Object> entry:set){
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+"="+value);
        }

    }
}
