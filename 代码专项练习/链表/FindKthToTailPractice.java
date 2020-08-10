package 代码专项练习.链表;
//输入一个链表，输出该链表中倒数第k个结点。
public class FindKthToTailPractice {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k==0){
            return null;
        }
        ListNode front=head;
        ListNode rear=head;
        while(k>0&&front!=null){
            k--;
            front=front.next;
        }
        while(front!=null){
            front=front.next;
            rear=rear.next;
        }
        return k>0?null:rear;
    }
}
