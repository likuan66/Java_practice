package List_02;

public class ThreePartsEqualSum {
    public boolean canThreePartsEqualSum(int[] A){
        int sum=0;
        for(int num:A){
            sum+=num;
        }
        if(sum%3!=0){
            return false;
        }
        sum/=3;
        int surSum=0,cur=0;//cur表示sum/3的个数
        for(int i=0;i<A.length;i++){
            surSum+=A[i];
            if(surSum==sum){
                cur++;
                if(cur==2){
                    return true;
                }
                surSum=0;
            }
        }
        return false;
    }
}
