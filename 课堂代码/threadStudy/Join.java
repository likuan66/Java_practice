package thread_study;

public class Join {
    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            final int j=i;
            new Thread(()->{
                System.out.println(j);
            }).start();
        }
        System.out.println("main");
    }
}
