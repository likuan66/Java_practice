package Java_practice;
/*题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。*/
public class three_practice {
    public static void main(String[] args) {
        for(int i=100;i<=999;i++)
        {
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100;
            if((ge*ge*ge+shi*shi*shi+bai*bai*bai)==i)
            {
                System.out.print(i+" ");
            }
        }
        /*
        for(int i=1;i<=9;i++)
        {
            for(int j=0;j<=9;j++)
            {
                for(int k=0;k<=9;k++)
                {
                    if(i*i*i+j*j*j+k*k*k==i*100+j*10+k)
                    {
                        System.out.print((i*100+j*10+k)+" ");
                    }
                }
            }
        }
        */
    }
}
