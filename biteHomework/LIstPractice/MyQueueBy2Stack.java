package biteHomework.StackAndQueue;
//用栈实现队列
import java.util.Stack;

public class MyQueueBy2Stack {
    private Stack<Integer> A=new Stack<>();
    private Stack<Integer> B=new Stack<>();
    public void push(int x){
        //先把B中的元素放到A中
        while(!B.isEmpty()){
            int temp=B.pop();
            A.push(temp);
        }
        //将新的元素放到A中
        A.push(x);
    }
    public Integer pop(){
        if(empty()){
            return null;
        }
        //将A中的元素放到B中
        while(!A.isEmpty()){
            int temp=A.pop();
            B.push(temp);
        }
        //获取B的栈顶元素
        return B.peek();
    }
    public Integer peek(){
        if(empty()){
            return null;
        }
        //将A中的元素放到B中
        while(!A.isEmpty()){
            int temp=A.pop();
            B.push(temp);
        }
        //获取B的栈顶元素
        return B.peek();
    }

    public boolean empty() {
        return A.isEmpty()&&B.isEmpty();
    }
}
