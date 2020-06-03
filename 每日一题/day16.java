package 每日一题;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Iterator;

public class day16 {
    /*
    输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
    例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
    则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
     */
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result=new ArrayList<>();
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return result;
        }
        int up=0;
        int down=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while(true){
            //最上面一行
            for(int col=left;col<=right;col++){
                result.add(matrix[up][col]);
            }
            //向下逼近
            up++;
            //判断是否越界
            if(up>down){
                break;
            }
            //最右一行
            for(int row=up;row<=down;row++){
                result.add(matrix[row][right]);
            }
            //向左逼近
            right--;
            //判断是否越界
            if(left>right){
                break;
            }
            //最下面的一行
            for(int col=right;col>=left;col--){
                result.add(matrix[down][col]);
            }
            //向上逼近
            down--;
            //判断是否越界
            if(down<up){
                break;
            }
            for(int row=down;row>=up;row--){
                result.add(matrix[row][left]);
            }
            //向右逼近
            left++;
            //判断是否越界
            if(left>right){
                break;
            }
        }
        return result;
    }
    /*
     定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
        注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
     */
    Stack<Integer> stack=new Stack<>();
    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        int min=stack.peek();
        int temp=0;
        Iterator<Integer> iterator=stack.iterator();
        while(iterator.hasNext()){
            temp=iterator.next();
            if(min>temp){
                min=temp;
            }
        }
        return min;
    }
}
