package 算法;

public class NumberOf1 {
    public int NumberOf1(int n) {
        int count=0;
        while(n!=0){
            n&=(n-1);
            count++;
        }
        return count;
    }
}
