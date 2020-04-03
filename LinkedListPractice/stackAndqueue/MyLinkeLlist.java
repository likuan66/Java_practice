package List_02;
import ListPractice.LinkedListTest;

import java.util.LinkedList;

class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
}
class MyLinkedList {
    ListNode head;
    int length;
    public MyLinkedList() {
        length=0;
        head=new ListNode(-1);
    }
   // 获取链表中第 index 个节点的值。如果索引无效，则返回-1。
    public int get(int index) {
        if(index>=length||index<0){
            return -1;
        }
        ListNode cur=head;
        for(int i=0;i<=index;i++){
            cur=cur.next;
        }
        return cur.val;
    }
    //在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
    public void addAtHead(int val) {
        ListNode temp=new ListNode(val);
        temp.next=head.next;
        head.next=temp;
        length++;
    }
    //将值为 val 的节点追加到链表的最后一个元素。
    public void addAtTail(int val) {
        ListNode cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        ListNode temp=new ListNode(val);
        cur.next=temp;
        length++;
    }
    //在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，
    // 则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
    public void addAtIndex(int index, int val) {
        if(index>length){
            return;
        }
        if(index==length){
            addAtTail(val);
            return;
        }
        if(index<0){
            index=index+length+1;
            ListNode cur= head;
            for(int i = 0; i < index; i++)
                cur= cur.next;
            ListNode ptr = cur.next;
            ListNode temp = new ListNode(val);
            cur.next = temp;
            temp.next = ptr;
            length ++;
        }
    }
    //如果索引 index 有效，则删除链表中的第 index 个节点
    public void deleteAtIndex(int index) {
        if(index >= length || index < 0)
            return;
        ListNode current = head;
        for(int i = 0; i < index; i++)
            current = current.next;
        current.next = current.next.next;
        length --;
    }
}
