package demo11;

public class WaiteAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj=new Object();
        //创建一个顾客线程（消费者）
        new Thread(){
          //保证等待何唤醒的线程只有一个执行，需要使用同步技术

            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("告知老板要的包子数量");
                    //调用wait方法，放弃cpu的执行，进入Waiting状态(无线等待状态）
                    try{
                        obj.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("包子已经做好了，开吃");
                }
            }
        }.start();
        //创建一个老板线程（生产者）
        new Thread(){
            public void run() {
                //花了5秒做包子
                try{
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //保证等待何唤醒的线程只能有一个执行，需要使用同步技术
                synchronized (obj){
                    System.out.println("老板5秒钟做好包子，告诉顾客吃包子");
                    obj.notify();
                }
            }
        }.start();
    }
}
