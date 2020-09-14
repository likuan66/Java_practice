package 算法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

//输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
public class GetLeastNumbers_SolutionPractice {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        if(input==null||k<=0||k>input.length){
            return list;
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>(k, Collections.reverseOrder());
        for(int i=0;i<input.length;i++){
            if(i<k){
                queue.offer(input[i]);
            }else{
                if(input[i]<queue.peek()){
                    queue.poll();
                    queue.offer(input[i]);
                }
            }
        }
        for(int i=0;i<k;i++){
            list.add(queue.poll());
        }
        return list;
    }
}
