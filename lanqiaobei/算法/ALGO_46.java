package lanqiao;
import java.util.Scanner;
public class ALGO_46 {
    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n%m==0){
                n/=m;
            }
            else{
                n=n/m+1;
            }
            int num = (int) (Math.pow(2, n)-1);
            System.out.println(num);
        }

}
