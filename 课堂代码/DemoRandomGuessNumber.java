package demo1;
import java.util.Random;
import java.util.Scanner;
//猜数字游戏[1,100]
public class DemoRandomGuessNumber {
    public static void main(String[] args) {
        Random r=new Random();
        int number=r.nextInt(100)+1;
        Scanner input = new Scanner(System.in);
        boolean fb=true;
        while(fb) {
            System.out.println("请输入你要猜的数字：");
            int result = input.nextInt();
            if(number==result){
                System.out.println("恭喜你猜对了！");
                fb=false;
            }
            else if(result>number){
                System.out.println("你猜大了！");
            }
            else{
                System.out.println("你猜小了！");
            }
        }
    }
}
