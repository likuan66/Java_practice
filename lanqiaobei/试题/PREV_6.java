package lanqiao;
/*
小明正在玩一个“翻硬币”的游戏。
桌上放着排成一排的若干硬币。我们用 * 表示正面，用 o 表示反面（是小写字母，不是零）。
比如，可能情形是：**oo***oooo
如果同时翻转左边的两个硬币，则变为：oooo***oooo
现在小明的问题是：如果已知了初始状态和要达到的目标状态，每次只能同时翻转相邻的两个硬币,那么对特定的局面，最少要翻动多少次呢？
我们约定：把翻动相邻的两个硬币叫做一步操作
 */
import java.util.Scanner;

public class PREV_6{

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String str1 = reader.nextLine();
        String str2 = reader.nextLine();
        str1.trim();//trim的方法是去掉字符串首尾的空格
        str2.trim();
        int step=0;
        int[] state1 = new int[str1.length()];
        int[] state2 = new int[str2.length()];
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i)=='*')
                state1[i] =1;
            else
                state1[i]=-1;
        }
        for (int i = 0; i < str2.length(); i++) {
            if(str2.charAt(i)=='*')
                state2[i] =1;
            else
                state2[i]=-1;
        }
        for(int i=0;i<str1.length()-1;i++)
        {
            if(state1[i]!=state2[i])
            {
                state1[i]=-state1[i];
                state1[i+1]=-state1[i+1];
                step++;
            }
        }
        System.out.println(step);
    }
}