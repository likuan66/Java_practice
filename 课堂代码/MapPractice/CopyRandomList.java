package biteHomework.MapPractice;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {
    static class Node{
        int val;
        Node next;
        Node random;
        public Node(int val){
            this.val=val;
            this.next=next;
            this.random=null;
        }
    }

    public Node copyRandomList(Node head) {
        //1.遍历旧连表。把旧链表的每个节点依次插入到map中，key是旧链表节点，value是拷贝出来的新的节点
        Map<Node,Node> map=new HashMap<>();
        for(Node cur=head;cur!=null;cur=cur.next){
            map.put(cur,new Node(cur.val));
        }
        //2.再次遍历链表，修改新链表中的next和random
        for(Node cur=head;cur!=null;cur=cur.next){
            //先从map中找到该cur对应的新链表节点
            Node newCur=map.get(cur);
            newCur.next=map.get(cur.next);
            newCur.random=map.get(cur.random);
        }
        //返回新链表的头节点
        return map.get(head);
    }
}

