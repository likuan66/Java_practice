package List_02;

public class MyCircularDeque {
    private int[] ring;
    private int capacity;
    private int head;
    private int tail;
    //构造函数,双端队列的大小为k。
    public MyCircularDeque(int k) {
        capacity = k + 1; // 因为环形队列需要一个空位判断队列为空
        ring = new int[capacity];
    }

    //将一个元素添加到双端队列头部。 如果操作成功返回 true。
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }

        head = (head + capacity - 1) % capacity; // 移动到前一位
        ring[head] = value;
        return true;
    }

    //将一个元素添加到双端队列尾部。如果操作成功返回 true。
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }

        ring[tail] = value;
        tail = (tail + 1) % capacity;
        return true;
    }

    //从双端队列头部删除一个元素。 如果操作成功返回 true
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }

        head = (head + 1) % capacity;
        return true;
    }

    //从双端队列尾部删除一个元素。如果操作成功返回 true
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }

        tail = (tail + capacity - 1) % capacity; // 移动到前一位
        return true;
    }

   //从双端队列头部获得一个元素。如果双端队列为空，返回 -1
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }

        return ring[head];
    }

    //获得双端队列的最后一个元素。 如果双端队列为空，返回 -1。
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }

        return ring[(tail + capacity - 1) % capacity];
    }

    //检查双端队列是否为空
    public boolean isEmpty() {
        return head == tail;
    }

    //检查双端队列是否满了
    public boolean isFull() {
        return (tail + 1) % capacity == head;
    }
}

