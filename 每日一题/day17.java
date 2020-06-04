package 剑指offer;

public class day17 {
    /*
    给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1），
    每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最
    大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，
    此时得到的最大乘积是18。
     */
    public int cutRope(int target) {
        int max=1;
        if(target>0&&target<=3){
            return target-1;
        }
        while(target>4){
            target-=3;
            max*=3;
        }
        return max*target;
    }
    /*
    地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，
    右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
    例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，
    它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
     */
    public int movingCount(int threshold, int rows, int cols) {
        int flag[][] = new int[rows][cols];
        return process(0, 0, rows, cols, flag, threshold);
    }

    private int process(int i, int j, int rows, int cols, int[][] flag, int threshold) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || numSum(i) + numSum(j)  > threshold || flag[i][j] == 1) return 0;
        flag[i][j] = 1;
        return process(i - 1, j, rows, cols, flag, threshold)
                + process(i + 1, j, rows, cols, flag, threshold)
                + process(i, j - 1, rows, cols, flag, threshold)
                + process(i, j + 1, rows, cols, flag, threshold)
                + 1;
    }

    private int numSum(int i) {
        int a= 0;
        do{
            a+= i%10;
        }while((i = i/10) > 0);
        return a;
    }
}
