package 算法;

import java.util.Stack;

public class StackDesign {
    private Stack<Integer> data_stack=new Stack<>();//数据栈
    private Stack<Integer> min_stack=new Stack<>();//辅助站
    public void push(int node){
        if(min_stack.empty()||node<min_stack.peek()){
            min_stack.push(node);
        }else{
            min_stack.push(min_stack.peek());
        }
        data_stack.push(node);
    }

    public void pop() {
        data_stack.pop();
        min_stack.pop();
    }

    public int top() {
        return data_stack.peek();
    }

    public int min() {
        return min_stack.peek();
    }
}
