package 算法;

import java.util.Stack;

public class IsPopOrderPractice {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA==null||popA==null||pushA.length==0||popA.length==0||pushA.length!=popA.length){
            return false;
        }
        Stack<Integer> st=new Stack<>();
        int i=0;
        int j=0;
        for(;i<pushA.length;i++){
            st.push(pushA[i]);
            while(!st.empty()&&st.peek()==popA[j]){
                st.pop();
                j++;
            }
        }
        return st.empty();
    }
}
