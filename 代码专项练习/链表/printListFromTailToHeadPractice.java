package 代码专项练习.链表;

import java.util.ArrayList;

class ListNode{
    int val;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }
}
//输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
public class printListFromTailToHeadPractice {
    //方法一：使用栈
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList<Integer> list=new ArrayList<>();
//        Stack<Integer> stack=new Stack<>();
//        while(listNode!=null){
//            stack.push(listNode.val);
//            listNode=listNode.next;
//        }
//        while(!stack.isEmpty()){
//            list.add(stack.pop());
//        }
//        return list;
//    }
    //方法二：逆置数组
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
//        ArrayList<Integer> list=new ArrayList<>();
//        while(listNode!=null){
//            list.add(listNode.val);
//            listNode=listNode.next;
//        }
//        int i=0;
//        int j=list.size()-1;
//        while(i<j){
//            Integer temp=list.get(i);
//            list.set(i,list.get(j));
//            list.set(j,temp);
//            i++;
//            j--;
//        }
//        return list;
//    }
    //方法三：递归
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> list=new ArrayList<>();
        printListFromTailToHeadCode(list,listNode);
        return list;
    }

    private void printListFromTailToHeadCode(ArrayList<Integer> list, ListNode listNode) {
        if(listNode!=null){
            return;
        }
        printListFromTailToHeadCode(list,listNode.next);
        list.add(listNode.val);
    }
}
