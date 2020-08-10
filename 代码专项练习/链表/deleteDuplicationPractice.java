package 代码专项练习.链表;
//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
// 重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
public class deleteDuplicationPractice {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null){
            return null;
        }
        ListNode head=new ListNode(-1);
        head.next=pHead;
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
        return head.next;
    }
}
