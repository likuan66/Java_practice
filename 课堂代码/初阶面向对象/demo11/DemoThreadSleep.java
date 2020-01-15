package demo10;

public class DemoThreadSleep {
    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            System.out.println(i);
            //使用Thread类的sleep方法让程序睡眠1秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
