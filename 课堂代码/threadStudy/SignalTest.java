package thread_study;

public class SignalTest {
    public static void main(String[] args) {
        private int SUM;
        for(int i=0;i<5;i++){
            new Thread(()->{
                try{
                    while(true){
                        synchronized (SignalTest.class){
                            if(SUM+3>100){
                                SUM+=3;
                                System.out.println(Thread.currentThread().getName()+"生产了面包，库存："+SUM);
                                Thread.sleep(500);
                                SignalTest.class.notify();//随机同之一个wait方法阻塞线程
                            }
                        }
                        Thread.sleep(200);
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            },"面包师傅【"+i+"】").start();
        }
    }
}
