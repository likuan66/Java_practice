package bite每日一题;

import java.util.Stack;

public class day05 {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    public void push(int node){
        stack1.push(node);
    }
    public int pop(){
        if(stack1.empty()&&stack2.empty()) {
            throw new RuntimeException("Queue is Empty");
        }
            if(stack2.empty()) {
                while (!stack1.empty()) {
                    stack2.push(stack1.pop());
                }
            }
        return stack2.pop();
    }
}
