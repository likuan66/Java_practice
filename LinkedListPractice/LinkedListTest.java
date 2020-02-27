package ListPractice;

import java.util.List;
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}

public class LinkedListTest {
    //1.删除链表中等于给定值
    public ListNode removeElements(ListNode head, int val) {
        //头部节点和中间节点要分别删除
        if(head==null){
            return null;
        }
        //先删除中间节点的情况
        ListNode prev=head;//prev指向cur位置的前一个节点
        ListNode cur=head.next;
        while(cur!=null){
            if(cur.val==val){
                //这个节点就需要删除
                prev.next=cur.next;//删除了cur节点
                cur=prev.next;//指向下一个元素
            }else{
                //这个节点不需要删除
                prev=cur;
                cur=cur.next;
            }
        }
        //接着考虑头节点(放到最后，只需要处理一次）
        if(head.val==val){
            head=head.next;
        }
        return head;
    }
    //2.反转一个单链表。
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode newHead=null;
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            ListNode next=cur.next;
            if(next==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return newHead;
    }
    //3.找到中间节点，如果中间为偶数则找第二个
    public ListNode middleNode(ListNode head) {
        int steps=size(head)/2;
        ListNode cur=head;
        for(int i=0;i<steps;i++){
            cur=cur.next;
        }
        return cur;
    }
    public int size(ListNode head){
        int size=0;
        ListNode cur=head;
        while(cur!=null){
            size++;
            cur=cur.next;
        }
        return size;
    }
    //4.找到倒数第k哥节点
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null){
            return null;
        }
        int size=size(head);
        if(k<=0||k>size){
            return null;
        }
        int steps=size-k;
        ListNode cur=head;
        for(int i=0;i<steps;i++){
            cur=cur.next;
        }
        return cur;
    }
    //5.将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode newHead=new ListNode(-1);
        ListNode newTail=newHead;
        ListNode cur1=l1;
        ListNode cur2=l2;
        while(cur1!=null&&cur2!=null){
            if(cur1.val<cur2.val){
                //把cur1对应的节点插入到新链表的尾端
                //此处需要考虑两种情况，newTail为null和非null的情况
                newTail.next=cur1;
                newTail=newTail.next;
                cur1=cur1.next;
            }else{
                newTail.next=cur2;
                newTail=newTail.next;
                cur2=cur2.next;
            }
        }
        //当循环结束时意味着当前cur1或者cur2已经有一到达了末尾
        //把另一个没有到达末尾的所有元素全部都移到最终链表的尾部
        if(cur1==null){
            newTail.next=cur2;
        }else{
            newTail.next=cur1;
        }
        return newTail.next;

    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(6);
        ListNode d=new ListNode(3);
        ListNode e=new ListNode(4);
        ListNode f=new ListNode(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        int x=1;
        LinkedListTest test=new LinkedListTest();
        ListNode result=test.removeElements(a,x);
        for(ListNode cur=result;cur!=null;cur=cur.next){
            System.out.println(cur.val);
        }
    }
}
