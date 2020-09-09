package 算法;

public class ListMerge {
    //递归
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            if (list1 != null)
                return list1;
            if (list2 != null)
                return list2;
            return null;
        }
        ListNode result = null;
        if (list1.val <= list2.val) {
            result = list1;
            result.next = Merge(list1.next, list2);
        } else {
            result = list2;
            result.next = Merge(list1, list2.next);
        }
        return result;
    }
    //非递归
//    public ListNode Merge(ListNode list1,ListNode list2) {
//
//        if(list1==null && list2==null){
//            return null;
//        }
//        if(list1==null){
//            return list2;
//        }else if(list2==null){
//            return list1;
//        }
//        ListNode node=new ListNode(-1);
//        ListNode current=node;
//        while(list1!=null && list2!=null){
//            if(list1.val<=list2.val){
//                current.next=list1;
//                list1=list1.next;
//            }else{
//                current.next=list2;
//                list2=list2.next;
//            }
//            current=current.next;
//        }
//        if(list1!=null){
//            current.next=list1;
//        }
//        if(list2!=null){
//            current.next=list2;
//        }
//        return node.next;
//    }
}
