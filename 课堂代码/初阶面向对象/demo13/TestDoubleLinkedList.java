package demo12;

public class TestDoubleLinkedList {
    private static void testAdd() {
        // 更严谨的测试方式:
        // 1. 测试参数非法情况
        // 2. 测试扩容功能
        // 3. 尾插的逻辑
        // 4. 普通位置的插入
        DoubleLinkedList seqList = new DoubleLinkedList();
        seqList.add(0, 100);
        seqList.add(0, 200);
        seqList.add(0, 300);
        seqList.add(0, 400);
        seqList.display();
    }

    private static void testContains() {
        DoubleLinkedList seqList = new DoubleLinkedList();
        seqList.add(0, 1);
        seqList.add(0, 2);
        seqList.add(0, 3);
        seqList.add(0, 4);
        System.out.println(seqList.contains(2));
    }

    private static void testSearch() {
        DoubleLinkedList seqList = new DoubleLinkedList();
        seqList.add(0, 1);
        seqList.add(0, 2);
        seqList.add(0, 3);
        seqList.add(0, 4);
        System.out.println(seqList.search(3));
    }

    private static void testRemove() {
        DoubleLinkedList seqList = new DoubleLinkedList();
        seqList.add(0, 1);
        seqList.add(0, 2);
        seqList.add(0, 3);
        seqList.add(0, 4);
        seqList.remove(2);
        seqList.display();
    }

    public static void main(String[] args) {
        testContains();
        testSearch();
        testRemove();
    }
}
