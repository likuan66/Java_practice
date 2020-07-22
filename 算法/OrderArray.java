package 算法;


public class OrderArray {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<0){
            return null;
        }
        ListNode A=head;
        ListNode B=head;
        while(k>0&&A!=null){
            k--;
            A=A.next;
        }
        while(A!=null){
            A=A.next;
            B=B.next;
        }
        return k>0?null:B;
    }
}
