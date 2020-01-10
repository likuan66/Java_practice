package demo10;

import RegisterException.RegisterException;

import java.util.Scanner;

public class DemoRegisterException {
    //使用数组保存已注册过的用户名（数据库）
    static String[] usernames={"张三","李四","王五"};

    public static void main(String[] args) throws RegisterException {
        //使用Scanner获取用户输入的注册的用户名（前端，页面）
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要注册的用户名：");
        String username=sc.next();
        checkUsername(username);
    }

    //定义一个方法，对输入的用户名进行判断
    public static void checkUsername(String username) /*throws RegisterException */{
        //遍历存储已经注册过的用户名的数组，获取每一个用户名
        for(String name:usernames){
            //使用获取的用户名何用户输入的用户名进行比较
            if(name.equals(username)){
                //true:用户名已经存在，抛出RegisterException异常，告知用户，你的用户名已经被注册过了
                try {
                    throw new RegisterException("你的用户名已经被注册过了");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;//结束方法
                }
            }
        }
        //如果循环结束，还没哟要找到重复的用户名，滚细腻注册成功
        System.out.println("恭喜你，注册成功");
    }

}
