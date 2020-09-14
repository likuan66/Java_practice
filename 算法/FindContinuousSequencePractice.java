package 算法;

import java.util.ArrayList;

public class FindContinuousSequencePractice {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        int low=1;
        int high=2;
        while(low<high){
            int total=(low+high)*(high-low+1)/2;
            if(total==sum){
                ArrayList<Integer> list=new ArrayList<>();
                for(int i=low;i<=high;i++){
                    list.add(i);
                }
                result.add(list);
                low++;
            }else if(total<sum){
                high++;
            }else{
                low++;
            }
        }
        return result;
    }
}
