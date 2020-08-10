package 代码专项练习.链表;
//输入一个链表，反转链表后，输出新链表的表头。
public class ReverseListPractice {
    //方法一：三指针
//    public ListNode ReverseList(ListNode head) {
//        if(head==null||head.next==null){
//            return head;
//        }
//        ListNode first=head;
//        ListNode second=first.next;
//        ListNode thrid=second.next;
//        while(thrid!=null){
//            second.next=first;
//            first=second;
//            second=thrid;
//            thrid=thrid.next;
//        }
//        second.next=first;
//        head.next=null;
//        head=second;
//        return head;
//    }
    //方法二：头插法
    public ListNode ReverseList(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode newhead=null;
        while(head!=null){
            ListNode p=head;
            head=head.next;
            p.next=newhead;
            newhead=p;
        }
        head=newhead;
        return head;
    }
}
