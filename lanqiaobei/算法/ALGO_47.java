package lanqiao;

/*
输入格式
　　第一行有且仅有一个整数n，表示两只蜜蜂将进行n次飞行。
　　接下来有n行
　　第i行有7个用空格分隔开的整数ai,bi,ci,di,ei,fi,ti　　，
    表示第一只蜜蜂单位时间的速度向量为(ai,bi,ci) ，第二只蜜蜂单位时间的速度向量为(di,ei,fi) ，它们飞行的时间为ti 。
　　最后一行有6个用空格分隔开的整数x1,y1,z1,x2,y2,z2，如题所示表示两只蜜蜂的初始坐标。
输出格式
　　输出仅包含一行，表示最后两只蜜蜂之间的距离。保留4位小数位。
 */
import java.util.Scanner;
public class ALGO_47 {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]v=new int[n][7];
        int buffer1[]=new int[3];
        int buffer2[]=new int[3];
        for(int i=0;i<n;i++){
            for(int j=0;j<7;j++){
                v[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++) buffer1[i]=sc.nextInt();
        for(int i=0;i<3;i++) buffer2[i]=sc.nextInt();
        int temp1=0;
        int temp2=0;
        int temp3=0;
        for(int i=0;i<n;i++){
            temp1+=v[i][0]*v[i][6];
            temp2+=v[i][1]*v[i][6];
            temp3+=v[i][2]*v[i][6];
        }
        int tmp1=0;
        int tmp2=0;
        int tmp3=0;
        for(int i=0;i<n;i++){
            tmp1+=v[i][3]*v[i][6];
            tmp2+=v[i][4]*v[i][6];
            tmp3+=v[i][5]*v[i][6];
        }
        int sx1=buffer1[0]+temp1;
        int sy1=buffer1[1]+temp2;
        int sz1=buffer1[2]+temp3;

        int sx2=buffer2[0]+tmp1;
        int sy2=buffer2[1]+tmp2;
        int sz2=buffer2[2]+tmp3;

        double sx=Math.abs(sx1-sx2);
        double sy=Math.abs(sy1-sy2);
        double sz=Math.abs(sz1-sz2);

        double ans=Math.sqrt(sx*sx+sy*sy+sz*sz);
        System.out.printf("%.4f", ans);
    }

}
