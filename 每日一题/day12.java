package 每日一题;

public class day12 {
    /*
     我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
     请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？

     比如n=3时，2*3的矩形块有3种覆盖方法：
     */
    public int RectCover(int target) {
        if(target<1){
            return 0;
        }else if(target==2||target==1){
            return target;
        }else{
            return RectCover(target-1)+RectCover(target-2);
        }
    }
    //输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
    public int NumberOf1(int n) {
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
    /*
    给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
    保证base和exponent不同时为0
     */
    public double Power(double base, int exponent) {
        if (base == 0.0){
            return 0.0;
        }
        // 前置结果设为1.0，即当exponent=0 的时候，就是这个结果
        double result = 1.0d;
        // 获取指数的绝对值
        int e = exponent > 0 ? exponent : -exponent;
        // 根据指数大小，循环累乘
        for(int i = 1 ; i <= e; i ++){
            result *= base;
        }
        // 根据指数正负，返回结果
        return exponent > 0 ? result : 1 / result;
    }
}
