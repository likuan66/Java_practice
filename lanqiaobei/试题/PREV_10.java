package lanqiao;
/*
幸运数是波兰数学家乌拉姆命名的。它采用与生成素数类似的“筛法”生成
首先从1开始写出自然数1,2,3,4,5,6,....
1 就是第一个幸运数。
我们从2这个数开始。把所有序号能被2整除的项删除，变为：
1 _ 3 _ 5 _ 7 _ 9 ....
把它们缩紧，重新记序，为：
1 3 5 7 9 .... 。这时，3为第2个幸运数，然后把所有能被3整除的序号位置的数删去。注意，是序号位置，不是那个数本身能否被3整除!! 删除的应该是5，11, 17, ...
此时7为第3个幸运数，然后再删去序号位置能被7整除的(19,39,...)
最后剩下的序列类似：
1, 3, 7, 9, 13, 15, 21, 25, 31, 33, 37, 43, 49, 51, 63, 67, 69, 73, 75, 79, ...
 */

import java.util.LinkedList;
import java.util.Scanner;

public class PREV_10{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int m = reader.nextInt();
        int n = reader.nextInt();
        LinkedList list = new LinkedList();
        for (int i = 1; i < n; i = i + 2) {
            list.add(i);
        }
        int order = 1;
        int num;
        while (order < list.size()) {
            num = (int) list.get(order);//取出幸运数
            int step = 0;
            int size = list.size();//固定大小
            for (int i = 0; i < size; i++) {


                if ((i + 1) % num == 0) {
                    list.remove(i - step);//去掉下标可以整除幸运数的值
                    step++;//当前链表删除掉的数量
                }
            }
            order++;//下一个幸运数的位置
        }
        //计数
        int count=0;
        while(!list.isEmpty())
        {
            int temp=(int) list.pop();
            if(temp<n&&m<temp)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
