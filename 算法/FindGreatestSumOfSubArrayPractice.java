package 算法;

public class FindGreatestSumOfSubArrayPractice {
    //方法一：我们可以使用dp完成 //定义状态# f(i): 以i下标结尾的最大连续子序列的和
    // 状态递推：f(i) = max(f(i-1)+array[i], array[i]) 【这里一定要注意连续关键字】
    // 状态初始化：f(0) = array[0], max = array[0]
//    public int FindGreatestSumOfSubArray(int[] array) {
//        if(array==null){
//            return 0;
//        }
//        int[] dp=new int[array.length];
//        dp[0]=array[0];
//        int max=array[0];
//        for(int i=1;i<array.length;i++){
//            dp[i]=Math.max(dp[i-1]+array[i],array[i]);
//            if(max<dp[i]){
//                max=dp[i];
//            }
//        }
//        return max;
//    }
    //方法二：可以进行一定程度优化，具体写完基本版本，在考虑
        public int FindGreatestSumOfSubArray(int[] array) {
            if(array==null){
                return 0;
            }
            int total=array[0];
            int max=array[0];
            for(int i=1;i<array.length;i++){
                if(total>=0){
                    total+=array[i];
                }else{
                    total=array[i];
                }
                if(total>max){
                    max=total;
                }
            }
            return max;
        }
}
