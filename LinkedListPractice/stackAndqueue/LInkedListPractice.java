package List_02;

import java.util.LinkedList;

public class LInkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        System.out.println(linkedList);

        linkedList.addFirst("d");//在链表的头部插入一个元素
        System.out.println(linkedList);
        linkedList.addLast("f");//在链表的尾部插入一个元素
        System.out.println(linkedList);

        linkedList.add(2,"x");//根据索引添加元素
        System.out.println(linkedList);

        linkedList.remove();//移除链表中第一个元素
        System.out.println(linkedList);
        linkedList.remove(2);//移除链表中的指定元素
        System.out.println(linkedList);
        linkedList.removeFirst();//一处头部的一个元素
        linkedList.removeLast();//移除尾部的一个元素
        System.out.println(linkedList);
        linkedList.clear();//清空链表

        linkedList.removeFirstOccurrence("b");//以处链表中第一次出现的元素
        linkedList.removeLastOccurrence("c");//移除链表中最后一次出现的该元素
        System.out.println(linkedList);
        linkedList.get(1);//根据索引获取元素
        linkedList.getFirst();//获取第一个元素
        linkedList.getLast();//获取最后一个元素
        System.out.println(linkedList);

        linkedList.poll();//查询并移除第一个元素
        linkedList.pop();//与removeFirst一样
        linkedList.push("cc");//与addFirst一样
        System.out.println(linkedList);
        linkedList.peek();//获取第一个元素但不移除
        linkedList.peekFirst();//获取第一个元素，但不移除
        linkedList.peekLast();//获取最后一个元素，但不一处

    }

}
