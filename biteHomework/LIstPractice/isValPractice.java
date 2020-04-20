package biteHomework.StackAndQueue;

import java.util.Stack;

/*
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
有效字符串需满足：
    左括号必须用相同类型的右括号闭合。
    左括号必须以正确的顺序闭合。
 */
public class isValPractice {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();//创建一个新的栈
        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }else if(c=='['){
                stack.push(']');
            }else if(c=='{'){
                stack.push('}');
            }else if(stack.isEmpty()||c!=stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
    /*
    public boolean isValid(String s) {
        // key 左括号. value 该左括号匹配的右括号
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        // 1. 先创建一个栈. 栈中保存字符类型即可
        Stack<Character> stack = new Stack<>();
        // 2. 循环遍历字符串中的每个字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 3. 判定 c 是否是左括号. 如果是左括号, 就入栈
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue; // 进入下次循环, 取出下一个字符
            }
            if (stack.empty()) {
                // 如果发现当前字符不是左括号, 并且栈又为空, 此时也说明字符串非法.
                // 这种情况说明, 前头没有合适的左括号和当前括号匹配
                return false;
            }
            // 4. 判定 c 是否是右括号. 如果是右括号, 就取出栈顶元素来对比一下
            char top = stack.pop();
//            //  1) 合法情况1
//            if (top == '(' && c == ')') {
//                continue;
//            }
//            //  2) 合法情况2
//            if (top == '[' && c == ']') {
//                continue;
//            }
//            //  3) 合法情况3
//            if (top == '{' && c == '}') {
//                continue;
//            }
            if (map.get(top) == c) {
                continue;
            }
            // 除了上面的三种合法情况, 剩下的都是非法情况
            return false;
        }
        // 遍历完字符串之后, 还得看下栈是否为空. 空栈才能是合法的字符串.
        if (stack.empty()) {
            return true;
        }
        return false;
    }

     */
}
