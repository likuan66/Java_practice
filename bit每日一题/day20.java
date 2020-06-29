package bite每日一题;

import java.util.Scanner;

/*
小易总是感觉饥饿，所以作为章鱼的小易经常出去寻找贝壳吃。最开始小易在一个初始位置x_0。
对于小易所处的当前位置x，他只能通过神秘的力量移动到 4 * x + 3或者8 * x + 7。
因为使用神秘力量要耗费太多体力，所以它只能使用神秘力量最多100,000次。贝壳总生长在能被
1,000,000,007整除的位置(比如：位置0，位置1,000,000,007，位置2,000,000,014等)。
小易需要你帮忙计算最少需要使用多少次神秘力量就能吃到贝壳。
 */
public class day20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        sc.close();
        int count=0;
        while(x!=0&&count<=300000){
            x=((x<<1)+1)%1000000007;
            count++;
        }
        int res=(count+2)/3;
        System.out.println(res>100000?-1:res);
    }
}
