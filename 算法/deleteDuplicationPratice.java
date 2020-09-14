package 算法;


public class deleteDuplicationPratice {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null){
            return pHead;
        }
        ListNode head=new ListNode(-1);
        head=pHead.next;

        ListNode prev=head;
        ListNode last=prev.next;
        while(last!=null){
            while(last.next!=null&&last.val!=last.next.val){
                prev=prev.next;
                last=last.next;
            }
            while(last.next!=null&&last.val==last.next.val){
                last=last.next;
            }
            if(prev.next!=last){
                prev.next=last.next;
            }
            last=last.next;
        }
        return head;
    }
}
