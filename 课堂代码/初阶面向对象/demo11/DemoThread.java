package demo10;

/*
        创建多线程的第一种方式：创建thread类的子类
        java。lang。Thread类：是描述线程的类，我们想要实现多线程程序，就必须继承thread类
        实现步骤：
                1.创建thread类的子类
                2.在thread子类中重写thread类中的run方法，设置线程任务
                3.创建thread类的子类对象
                4.调用thread类中的方法start方法，开启新的线程，执行run方法

 */
public class DemoThread {
    public static void main(String[] args) {
       // 3.创建thread类的子类对象
        MyThread mt=new MyThread();
        //4.调用thread类中的方法start方法，开启新的线程，执行run方法
        mt.start();
        for(int i=0;i<20;i++){
            System.out.println("main"+i);
        }
    }
}
