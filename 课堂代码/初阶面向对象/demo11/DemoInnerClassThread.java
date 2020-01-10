package demo10;

public class DemoInnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        //new MyThread().start();
        new Thread(){
            //重写run方法，设置线程任务
            @Override
            public void run(){
                for(int i=0;i<20;i++){
                    System.out.println(Thread.currentThread().getName()+"-->"+"库里");
                }
            }
        }.start();

        //线程的接口Runnable
        //Runnable r=new RunnableImpl();//多态
        Runnable r=new Runnable(){
            //重写run方法，设置线程任务
            @Override
            public void run() {
                for(int i=0;i<20;i++){
                    System.out.println(Thread.currentThread().getName()+"-->"+"汤普森");
                }
            }
        };
        new Thread(r).start();
    }
}
