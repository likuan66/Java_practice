package lanqiao;
import java.util.Scanner;
public class PREV_3 {
        public static  int n,ans;
        public static int[] array = {1,2,3,4,5,6,7,8,9};
        public static void main(String[] args) {
            // TODO Auto-generated method stub

            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            count(0);
            System.out.println(ans);
        }
        private static void count(int k) {
            // TODO Auto-generated method stub
            //如果完成一次全排列
            if (k == 9) {
                for (int i = 1; i<k; i++) {
                    for (int j = i+1; j<k; j++) {
                        //将数组分为整数，分母，分子三部分
                        int Inte = Cut(0,i);
                        int up =  Cut(i,j);
                        int down = Cut(j,k);
                        if (up%down != 0 )
                            continue;
                        if (Inte + up/down == n)
                            ans++;

                    }
                }
                return ;
            }

            for (int i = k; i<9; i++) {
                //交换数字顺序
                int temp = array[i];
                array[i] = array[k];
                array[k] = temp;
                //要写k+1,不能写i+1
                //比如k=2,213456789,先变前面的顺序，再变后面的顺序
                //否则就变成一个乱套的顺序，比如214536789
                //后面的顺序 应该按正的顺序排完之后再依次变
                count(k+1);//回溯
                //还原数字顺序
                temp = array[i];
                array[i] = array[k];
                array[k] = temp;

            }
        }
        private static int Cut(int i, int j) {
            // TODO Auto-generated method stub
            //将i 到j-1之间的数变成一个整数，
            //如1，2，3->123,num不断转变为：0，1，12，123
            int num = 0;
            for (int k = i; k<j; k++) {
                num = array[k] + num*10;
            }
            return num;
        }
}
