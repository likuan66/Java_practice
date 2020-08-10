package 代码专项练习.链表;

//输入两个链表，找出它们的第一个公共结点。（注意因为传入数据是链表，
// 所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
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

    private int GetListLength(ListNode pHead1) {
        if(pHead1==null){
            return 0;
        }
        int len=0;
        while(pHead1!=null){
            len++;
            pHead1=pHead1.next;
        }
        return len;
    }
}
