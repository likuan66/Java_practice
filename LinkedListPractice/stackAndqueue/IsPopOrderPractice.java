package List_02;

import java.util.Stack;

public class IsPopOrderPractice {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;//用于标识弹出序列的位置
        for (int i = 0; i <pushA.length;i++){
            stack.push(pushA[i]);
            while(!stack.isEmpty()&&stack.peek()==popA[index]){
                stack.pop();
                index+=1;//弹出序列后移
            }
        }
        return stack.isEmpty();
    }
}
