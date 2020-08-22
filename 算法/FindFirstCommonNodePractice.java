package 算法;

public class FindFirstCommonNodePractice {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null){
            return null;
        }
        int length1=GetListLength(pHead1);
        int length2=GetListLength(pHead2);
        int step=Math.abs(length1-length2);
        if(length1>length2){
            while(step>0){
                pHead1=pHead1.next;
                step--;
            }
        }else{
            while(step>0){
                pHead2=pHead2.next;
                step--;
            }
        }
        while(pHead1!=null&&pHead2!=null){
            if(pHead1==pHead2){
                return pHead1;
            }
            pHead1=pHead1.next;
            pHead2=pHead2.next;
        }
        return null;
    }

    private int GetListLength(ListNode head) {
        if(head==null){
            return 0;
        }
        int len=0;
        while(head!=null){
            head=head.next;
            len++;
        }
        return len;
    }
}
