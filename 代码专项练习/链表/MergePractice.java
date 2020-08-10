package 代码专项练习.链表;

//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
public class MergePractice {
    //非递归
//    public ListNode Merge(ListNode list1,ListNode list2) {
//        if(list1==null&&list2==null){
//            return null;
//        }
//        if(list1==null){
//            return list2;
//        }
//        if(list2==null){
//            return list1;
//        }
//        ListNode node=new ListNode(-1);
//        ListNode list=node;
//        while(list1!=null&&list2!=null){
//            if(list1.val<=list2.val){
//                list.next=list1;
//                list1=list1.next;
//            }else{
//                list.next=list2;
//                list2=list2.next;
//            }
//            list=list.next;
//        }
//        if(list1!=null){
//            list.next=list1;
//        }
//        if(list2!=null){
//            list.next=list2;
//        }
//        return node.next;
//    }
    //递归
    public ListNode Merge(ListNode list1,ListNode list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode result=null;
        if(list1.val<=list2.val){
            result=list1;
            result.next=Merge(list1.next,list2);
        }else{
            result=list2;
            result.next=Merge(list1,list2.next);
        }
        return result;
    }
}
