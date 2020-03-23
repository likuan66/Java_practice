package lanqiao;
/*
很久以前，T王国空前繁荣。为了更好地管理国家，王国修建了大量的快速路，用于连接首都和王国内的各大城市。
为节省经费，T国的大臣们经过思考，制定了一套优秀的修建方案，使得任何一个大城市都能从首都直接或者通过其他大城市间接到达。同时，如果不重复经过大城市，从首都到达每个大城市的方案都是唯一的。
J是T国重要大臣，他巡查于各大城市之间，体察民情。所以，从一个城市马不停蹄地到另一个城市成了J最常做的事情。他有一个钱袋，用于存放往来城市间的路费。
聪明的J发现，如果不在某个城市停下来修整，在连续行进过程中，他所花的路费与他已走过的距离有关，在走第x千米到第x+1千米这一千米中（x是整数），他花费的路费是x+10这么多。也就是说走1千米花费11，走2千米要花费23。
J大臣想知道：他从某一个城市出发，中间不休息，到达另一个城市，所有可能花费的路费中最多是多少呢？
 */

import java.util.Arrays;
import java.util.Scanner;
//先由任意一点出发，dfs找出距离这点最远的一个点，则这个点一定是直径的一个断点，
//再从这个点出发dfs找到距离这个点最远的一个点，这个点就是直径的另一个端点，这两个端点之间的距离最长。
public class PREV_9 {
    static int n,max=0,dian;//dian为最长路径的端点，  max为最长路径
    static int a[][];//存放长度或权值
    //	static int l[];
    static int []vis;//标记
    //	static int [][]point= {{-1,0},{1,0},{0,-1},{0,1}};
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        a=new int[n+1][n+1];
        vis=new int[n+1];
        for(int i=0;i<n-1;i++) {
            int a1=s.nextInt();
            int a2=s.nextInt();
            int a3=s.nextInt();
            a[a1][a2]=a[a2][a1]=a3;
        }
        vis[1]=1;//因为五个城市为1-5，所以不会由0的存在
        dfs(1,0);//获得最长路径端点
        Arrays.fill(vis, 0);//置零
        vis[dian]=1;//最长路径端点标记为1
        dfs(dian,0);//获得最长路径
        System.out.println(((11+10+max)*max)/2);//计算路费
    }
    public static void dfs(int x,int dist) {//深搜
        if(max<dist) {
            dian=x;
            max=dist;
        }

        for(int i=1;i<=n;i++) {
            if(vis[i]!=1&&a[x][i]!=0) {
                vis[i]=1;
                dist+=a[x][i];
                dfs(i,dist);
                vis[i]=0;
                dist-=a[x][i];
            }
        }
        return;
    }
}