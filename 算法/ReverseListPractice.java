package 算法;

public class ReverseListPractice {
    //方法一：
//    public ListNode ReverseList(ListNode head) {
//        if(head==null||head.next==null){
//            return head;
//        }
//        ListNode first=head;
//        ListNode mid=head.next;
//        ListNode end=mid.next;
//        while(end!=null){
//            mid.next=first;
//            first=mid;
//            mid=end;
//            end=end.next;
//        }
//        mid.next=first;
//        head.next=null;
//        head=mid;
//        return head;
//    }
    //方法二
    public ListNode ReverseList(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode new_head=null;
        while(head!=null){
            ListNode p=head;
            head=head.next;
            p.next=new_head;
            new_head=p;
        }
        return new_head;
    }
}
