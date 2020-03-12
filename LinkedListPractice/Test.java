package ListPractice;

public class Test {
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
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
                newTail.next=new ListNode(cur1.val);
                newTail=newTail.next;
                cur1=cur1.next;
            }else{
                newTail.next=new ListNode(cur2.val);
                newTail=newTail.next;
                cur2=cur2.next;
            }
        }
        if(cur1==null){
            newTail.next=cur2;
        }else{
            newTail.next=cur1;
        }
        return newHead.next;
    }
    public ListNode FindKthToTail(ListNode head,int k){
        if(head==null){
            return null;
        }
        int size=Size(head);
        int steps=size-k;
        ListNode cur=head;
        for(int i=0;i<steps;i++){
            cur=cur.next;
        }
        return cur;
    }

    private int Size(ListNode head) {
        int count=0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            count++;
        }
        return count;
    }
    public ListNode middleNode(ListNode head){
        int size=Size(head);
        ListNode cur=head;
        int steps=size/2;
        for(int i=0;i<steps;i++){
            cur=cur.next;
        }
        return cur;
    }
    public ListNode reverseList(ListNode head){
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
    public ListNode removeElements(ListNode head, int val){
        if(head==null){
            return null;
        }
        ListNode prev=head;
        ListNode cur=head.next;
        while(cur!=null){
            if(cur.val==val){
                prev.next=cur.next;
                cur=prev.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        if(head.val==val){
            head=head.next;
        }
        return head;
    }
    public ListNode detectCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&slow!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null||fast.next!=null){
            return null;
        }
        ListNode cur1=head;
        ListNode cur2=fast;
        while(cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
    }
    public boolean hasCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&slow!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        int size1=Size(headA);
        int size2=Size(headB);
        if(size1>size2){
            int offset=size1-size2;
            for(int i=0;i<offset;i++){
                headA=headA.next;
            }
        }else{
            int offset=size2-size1;
            for(int i=0;i<offset;i++){
                headB=headB.next;
            }
        }
        while (headA != null && headB != null) {
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
    public boolean chkPalindrome(ListNode A){
        int size=Size(A);
        int steps=size/2;
        ListNode B=A;
        for(int i=0;i<steps;i++){
            B=B.next;
        }
        ListNode prev=null;
        ListNode cur=B;
        while (cur != null) {
            ListNode next=cur.next;
            if(next==null){
                B=cur;
            }
            cur.next=cur;
            prev=cur;
            cur=next;
        }
        while(B!=null){
            if(A.val!=B.val){
                return false;
            }
            A=A.next;
            B=B.next;
        }
        return true;
    }
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode newhead=new ListNode(-1);
        ListNode newTail=newhead;
        ListNode cur=pHead;
        while(cur!=null){
            if (cur.next != null && cur.next.val == cur.val) {
                while(cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
                cur=cur.next;
            }else{
                newTail.next=new ListNode(cur.val);
                newTail=newTail.next;
                cur=cur.next;
            }
        }
        return newhead.next;
    }
}
