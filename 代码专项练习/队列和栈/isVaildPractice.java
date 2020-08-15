package 代码专项练习.队列和栈;

import java.util.Stack;
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
public class isVaildPractice {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:stack){
            if(ch=='('){
                stack.push(')');
            }else if(ch=='['){
                stack.push(']');
            }else if(ch=='{'){
                stack.push('}');
            }else if(stack.isEmpty()||ch!=stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
