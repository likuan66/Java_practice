package thread_study;

public class jionTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(()->{
            try{
                Thread.sleep(3000);
                System.out.println("Thread baby");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        });
        t.start();
        t.join();
        System.out.println("main");
    }
}
