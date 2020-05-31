package 每日一题;

public class day13 {
    /*
    输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于
    数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     */
    public static void reOrderArray(int [] array) {
        for(int i= 0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]%2==0&&array[j+1]%2==1){
                    int t = array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,4,7,8,5,2,9,6,3};
        reOrderArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    /*
    输入一个链表，输出该链表中倒数第k个结点
     */
    public ListNode FindKthToTail(ListNode list,int k) {
        if (list == null)   return list;

        ListNode node = list;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        if (count < k)  return null;

        ListNode p = list;
        for (int i = 0; i < count - k; i++) {
            p = p.next;
        }

        return p;
    }
}
