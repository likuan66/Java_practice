package 每日一题;

/*
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序
的方式存储的，并且它们的每个节点只能存储 一位 数字。
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class day06 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(-1);
        ListNode p=l1,q=l2,cur=head;
        int carry=0;//carry表示进位（两链表对应位相加的进位，初始化为0）
        while(p!=null||q!=null){
            int x=(p!=null)?p.val:0;
            int y=(q!=null)?q.val:0;
            int sum=carry+x+y;
            carry=sum/10;
            cur.next=new ListNode(sum%10);
            cur=cur.next;
            if(p!=null){
                p=p.next;
            }
            if(q!=null){
                q=q.next;
            }
        }
        if(carry>0){
            cur.next=new ListNode(carry);
        }
        return head.next;
    }
}
