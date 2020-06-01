package 每日一题;

public class day14 {
    //输入一个链表，反转链表后，输出新链表的表头。
    public ListNode ReverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode newhead=null;
        ListNode pNode=head;
        ListNode pPrev=null;
        while(pNode!=null){
            ListNode pNext=pNode.next;
            if(pNext==null){
                newhead=pNode;
            }
            pNode.next=pPrev;
            pPrev=pNode;
            pNode=pNext;
        }
        return newhead;
    }
    //输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
    //非递归
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null&&list2==null){
            return null;
        }
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode newNode=new ListNode(-1);
        ListNode newhead=newNode;
        ListNode l1=list1;
        ListNode l2=list2;
        while (l1!=null&&l2!=null){
            if(l1.val>l2.val){
                newhead.next=l2;
                l2=l2.next;
            }else{
                newhead.next=l1;
                l1=l1.next;
            }
            newhead=newhead.next;
        }
        if(l1==null){
            newhead.next=l2;
        }
        if(l2==null){
            newhead.next=l1;
        }
        return newNode.next;
    }
    //递归
    public ListNode Merge1(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            list1.next = Merge1(list1.next, list2);
            return list1;
        }else{
            list2.next = Merge1(list1, list2.next);
            return list2;
        }
    }
}
