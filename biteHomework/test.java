package demo01;

import static java.lang.StrictMath.sqrt;

public class test {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=1000;i++){
            if(isPrime(i)){
                count++;
                if(count%10==0){
                    System.out.println();
                }
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int m){
        for(int i=2;i<=sqrt(m);i++){
            if(m%i==0){
                return false;
            }
        }
        return true;
    }
}
