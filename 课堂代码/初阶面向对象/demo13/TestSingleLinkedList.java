package demo12;

public class TestSingleLinkedList {
    private static void testAddFirst(){
        SingleLinkedList LinkedList=new SingleLinkedList();
        LinkedList.addFist(1);
        LinkedList.addFist(2);
        LinkedList.addFist(3);
        LinkedList.addFist(4);
        LinkedList.display();
    }
    private static void testAddLast(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);
        singleLinkedList.display();
    }
    private static void testAddIndex(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addIndex(0,1);
        singleLinkedList.addIndex(1,2);
        singleLinkedList.addIndex(1,3);
        singleLinkedList.addIndex(1,4);
        singleLinkedList.display();
    }
    private static void testContains(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);
        System.out.println(singleLinkedList.contains(3));
    }
    private static void testRemov(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(4);
        singleLinkedList.remove(3);
        singleLinkedList.display();
    }

    public static void main(String[] args) {
        testAddFirst();
        testAddLast();
        testAddIndex();
        testContains();
        testRemov();
    }

}
