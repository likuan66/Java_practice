package demo09;

import java.util.HashMap;
import java.util.Scanner;

/*
        练习：计算一个字符串中每个字符出现的次数
        分析：
            1.使用Scanner获取用户输入的字符串
            2.创建Map集合，key是字符串中的字符，value是字符个数
            3.遍历字符串获取每一个字符
            4.使用获取到的字符，去Map集合中判断可以是否存在
                    key存在：
                        通过字符key，获取value个数
                        value++；
                        put（可以，value)把新的value存储到Map集合中
                     key不存在
                        put（key，1）
             5.遍历Map集合输出结果

 */
public class DemoMapTest {
    public static void main(String[] args) {
        //1.使用Scanner获取用户输入的字符串
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一串字符串");
        String str=scanner.nextLine();
        //2.创建Map集合，key是字符串中的字符，value是字符个数
        HashMap<Character, Integer> map = new HashMap<>();
        //3.遍历字符串获取每一个字符
        for(char c:str.toCharArray()){
            //4.使用获取到的字符，去Map集合中判断可以是否存在
            if(map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else{
                map.put(c,1);
            }
        }
        //5.遍历Map集合输出结果
        for(Character key:map.keySet()){
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
