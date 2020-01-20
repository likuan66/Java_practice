package demo10;
//  1.创建thread类的子类
public class MyThread extends Thread {
    //2.在thread子类中重写thread类中的run方法，设置线程任务
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("run"+i);
        }
    }
}
