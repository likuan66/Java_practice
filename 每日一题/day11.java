package 每日一题;

public class day11 {
    /*
    大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项
    （从0开始，第0项为0，第1项是1）。
     n<=39
     */
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    /*
    一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法
    （先后次序不同算不同的结果）。
     */
    public int JumpFloor(int target) {
        if(target==1) return 1;
        if(target==2) return 2;
        if(target==3) return 3;
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
    /*
    一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
    求该青蛙跳上一个n级的台阶总共有多少种跳法。
     */
    public int JumpFloorII(int target) {
        if(target<=2)
            return target;
        else
            return JumpFloorII(target-1)*2;
    }
}
