package lanqiao;

import java.util.Scanner;

public class ALGO_4{
    public int[][] dp = new int[100002][2];
    public int[][] tree = new int[100002][300];  //tree[i][3] = num表示第i个节点的第3个孩子节点为第num个节点
    /*
     * 参数point1:表示输入的第point1个节点，不是节点权值
     * 参数point2:表示输入的第point2的节点，不是节点权值
     * 说明：由于题目仅仅给出边的说明，并未说明两个节点谁是父母节点，所以以下有两种情形
     */
    public void creatTree(int point1, int point2) {
        int i = 0;
        //当第point1个节点为父母节点时
        while(tree[point1][i] != 0) i++;  //如果第point1个节点已经有孩子了，再增加一个孩子
        tree[point1][i] = point2;
        int j = 0;
        //当第point2个节点为父母节点时
        while(tree[point2][j] != 0) j++;
        tree[point2][j] = point1;
    }
    /*
     * 参数satrt:开始对树进行DFS遍历的开始节点，为具体节点位置，不是节点权值
     * 参数root:为第start个节点的直接父母节点位置，root = 0表示根节点的父母节点
     */
    public void dfs(int start, int root) {
        int child = tree[start][0];  //第start个节点的第1个孩子节点
        for(int i = 0;child != 0;i++) {
            child = tree[start][i];
            if(child != root) {  //防止出现start的孩子成为start的父亲情况
                dfs(child, start);
                dp[start][1] += dp[child][0];  //当第child个节点没有孩子节点时，开始回溯
                dp[start][0] += (dp[child][1] > dp[child][0] ? dp[child][1] : dp[child][0]);
            }
        }
    }

    public static void main(String[] args) {
        ALGO_4 test = new ALGO_4();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0;i < n;i++)
            test.dp[i + 1][1] = in.nextInt();
        for(int i = 0;i < n - 1;i++) {
            int point1 = in.nextInt();
            int point2 = in.nextInt();
            test.creatTree(point1, point2);
        }
        test.dfs(1, 0);   //从创建的数的根节点（即第1个顶点，0表示根节点的父母节点）开始进行DFS遍历
        int max = (test.dp[1][1] > test.dp[1][0] ? test.dp[1][1] : test.dp[1][0]);
        System.out.println(max);
    }
}
