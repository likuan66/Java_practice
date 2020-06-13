package thread_study;
/*
三个线程：第一个纸打印A，第二个纸打印B，第三个只打印C
        打印结果：ABC

        要求：三个线程同时打印
 */
public class SequeencePrint {
    public static void main(String[] args) {
        print2();
    }
    private static void print(){
        Thread t1=new Thread(new print("A",null));
        Thread t2=new Thread(new print("B",t1));
        Thread t3=new Thread(new print("C",t2));
        t1.start();
        t2.start();
        t3.start();
    }
    private static class print implements Runnable{
        private String content;
        private Thread t;

        public print(String content, Thread t) {
            this.content = content;
            this.t = t;
        }

        public void run() {
            try{
                if(t!=null){
                    t.join();
                }
                System.out.println(content);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    private static void print2(){
        for(int i=0;i<print2.ARRAY.length;i++){
            new Thread(new print2(i)).start();
        }
    }
    private static class print2 implements Runnable{
        private int idx;
        public static String[] ARRAY = {"A", "B", "C", "D", "E"};
        private static int INDEX;
        public print2(int idx) {
            this.idx = idx;
        }

        @Override
        public void run() {
            try {
                for(int i=0; i<10; i++){
                    synchronized (ARRAY) {
                        while (idx != INDEX) {
                            ARRAY.wait();
                        }
                        System.out.print(ARRAY[idx]);
                        if(INDEX == ARRAY.length - 1)
                            System.out.println();
                        INDEX = (INDEX+1) % ARRAY.length;
                        ARRAY.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
