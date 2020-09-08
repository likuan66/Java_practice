package 算法;

import java.util.ArrayList;
class ListNode{
    int val;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }
}

public class ListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        printListFromTailToHeadCore(arrayList,listNode);
        return arrayList;
    }

    private void printListFromTailToHeadCore(ArrayList<Integer> arrayList, ListNode listNode) {
        if(listNode==null){
            return ;
        }
        printListFromTailToHeadCore(arrayList,listNode.next);
        arrayList.add(listNode.val);
    }
}
