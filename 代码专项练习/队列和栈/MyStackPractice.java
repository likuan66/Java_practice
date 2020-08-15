package 代码专项练习.队列和栈;

import java.util.LinkedList;
import java.util.Queue;

//用队列实现栈
public class MyStackPractice {
    Queue<Integer> A=new LinkedList<>();
    Queue<Integer> B=new LinkedList<>();
    public void push(int x) {
        A.offer(x);
        while(!B.isEmpty()){
            A.offer(B.poll());
        }
        Queue temp=A;
        A=B;
        B=temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return B.poll();
    }

    /** Get the top element. */
    public int top() {
        return B.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return B.isEmpty();
    }
}
