package demo1;
import java.util.Random;
public class DemoRedom {
    public static void main(String[] args) {
        int n=5;
        Random r=new Random();
        for(int i=0;i<10;i++) {
            int result = r.nextInt(n) + 1;//本来范围是[0,n),加1之后范围变成[1,n+1),也就是[1,n]
            System.out.println(result);
        }
    }
}
