package biteHomework.StackAndQueue;

import javax.swing.*;
import java.util.Stack;

/*
设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
    push(x) -- 将元素 x 推入栈中。
    pop() -- 删除栈顶的元素。
    top() -- 获取栈顶元素。
    getMin() -- 检索栈中的最小元素
 */
public class MinStack {
        private Stack<Integer> A=new Stack<>();
        private Stack<Integer> B=new Stack<>();
        public void push(int x){
            A.push(x);
            if(B.isEmpty()){
                B.push(x);
                return;
            }
            int min=B.peek();
            if(x<min){
                min=x;
            }
            B.push(min);
        }
        public Integer pop(){
            if(A.isEmpty()){
                return null;
            }
            B.pop();
            return A.pop();
        }
        public Integer top(){
            if(A.isEmpty()){
                return null;
            }
            return A.peek();
        }
        public Integer getMin(){
            if(B.isEmpty()){
                return null;
            }
            return B.peek();
        }

}
