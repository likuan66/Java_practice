package ListPractice;

public class LinkedListTest02 {
    public int size(ListNode head) {
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }
    //6.以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public ListNode partition(ListNode pHead, int x) {
        if (pHead == null) {
            return null;
        }
        if (pHead.next == null) {
            return pHead;
        }
        ListNode bighead = new ListNode(-1);//傀儡节点
        ListNode bigTail = bighead;
        ListNode smallHead = new ListNode(-1);
        ListNode smallTail = smallHead;
        for (ListNode cur = pHead; cur != null; cur = cur.next) {
            if (cur.val < x) {
                //// 插入到 smallTail 后面, 创建崭新的节点(新节点的 next 一定是 null)
                smallTail.next = new ListNode(cur.val);
                smallTail = smallTail.next;
            } else {
                bigTail.next = new ListNode(cur.val);
                bigTail = bigTail.next;
            }
        }
        //将两个链表的收尾相连接在一起
        smallTail.next = bighead.next;
        return smallHead.next;
    }

    //7.在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode newHead=new ListNode(-1);
        ListNode newTail=newHead;
        //循环遍历链表
        ListNode cur=pHead;
        while(cur!=null){
            // 判定 cur 是否是重复元素
            // 时刻牢记, 针对某个引用进行 . 操作的时候, 必须保证该引用不能是 null
            // 假设 cur 已经指向 最后一个元素了, cur.next 就是 null
            // 短路求值. 左侧表达式如果为 false, 右侧就不求值了(对于逻辑与来说)
            if(cur.next!=null&&cur.val==cur.next.val){
                // 说明 cur 指向的元素就是重复元素, 接下来就需要找到这个重复元素区间的末尾
                // 最终能够跳过整个重复元素的区间
                while(cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
                // 上面的 while 循环结束, 此时 cur 就指向这片相同元素区间的最后一个位置
                // 再多走一步就意味着跳过了整个相同元素的区间
                cur=cur.next;
            }else{
                // 说明 cur 指向的元素不是重复元素
                // 把这个元素插入到新链表中
                newTail.next=new ListNode(cur.val);
                newTail=newTail.next;
                cur=cur.next;
            }
        }
        return newHead.next;
    }
    //8.链表的回文结构
    public boolean chkPalindrome(ListNode A) {
        //1.先找到A链表的中间节点
        int size=size(A);
        int steps=size/2;
        ListNode B=A;
        for(int i=0;i<steps;i++){
            B=B.next;
        }
        //上面的循环结束后，B就指向A的中间节点
        //2.从B开始对后面的链表进行逆置操作
        ListNode prev=null;
        ListNode cur=B;
        while(cur!=null){
            ListNode next=cur.next;
            if(next==null){
                //说明此时的cur已经到达链表的最后一个节点，更新头结点的位置
                B=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        //3.分别从A和B出发判断两个链表的元素是否相等
        //如果链表长度是奇数个，那A和B的长读是相同的，此时无影响
        //如果链表的长度是偶数个时，那么A的长度比B要长一个元素，就需要遍历的时候注意循环条件
        //要以B为准则
        while(B!=null){
            if(A.val!=B.val){
                return false;
            }
            A=A.next;
            B=B.next;
        }
        return true;
    }
    //9.输入两个链表，找出它们的第一个公共结点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //1.分别求两个链表的长度
        int size1=size(headA);
        int size2=size(headB);
        //2.算出差值，让长的链表先走
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
        //3.此时headB和headA已经在同一起跑线上了
        while(headA!=null&&headB!=null){
            //比较的是节点是不是相同对象
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
    //10.给定一个链表，判断链表中是否有环
    public boolean hasCycle(ListNode head) {
        //用快慢指针的方法
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    //11.给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public ListNode detectCycle(ListNode head) {
        //1.使用快慢指针，找到快慢指针的交点
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null||fast.next==null){
            //链表不带环
            return null;
        }
        //带环的情况，设定两个引用，分别从链表头部和fast slow交点出发按照相同的速度同步往后走
        ListNode cur1=head;
        ListNode cur2=fast;
        while(cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        //这个位置就是环的入口
        return cur1;
    }
}

