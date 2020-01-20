package demo10;
//1.创建一个Runnable类的实现类接口
public class RunnableImpl implements Runnable {
    //2.在实现类中重写Runnable接口的方法，设置线程任务
    @Override
    public void  run(){
        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
