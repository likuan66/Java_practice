package thread_study;

/**
 * 阻塞式队列：
 * （1）基于数组的循环队列实现
 * （2）提供一个队列
 *         取元素消费的时候，如果队列为空，阻塞等待。
 *         如果队列满了，存元素生产的时候，阻塞等待
 */
public class MyBlockingQueue<T> {
    private Object[] table;
    //取元素时的索引
    private int tabkeIndex;
    //存放元素时的索引
    private int putIndex;
    //保存的元素大小
    private int size;

    public MyBlockingQueue(int capacity){
        table=new Object[capacity];
    }

    public synchronized void put(T element) throws InterruptedException {
        while(size==table.length){
            wait();
        }
        table[putIndex]=element;//存放元素
        putIndex=(putIndex+1)%table.length;
        size++;
        notifyAll();
        Thread.sleep(500);
    }
    public synchronized T take() throws InterruptedException {
        while(size==0){
            wait();
        }
        Object element=table[tabkeIndex];
        tabkeIndex=(tabkeIndex+1)%table.length;
        size--;
        notifyAll();
        Thread.sleep(500);
        return (T)element;
    }
    /**
     * 不可以使用volatile不加锁的方式完成size：
     * 如果size可以和put/take并发、并行的执行，
     * 可能导致put/take中size操作之前就返回了一个没有修改过的size，不正确
     * size++/size--之前返回size的值
     * @return
     */
    public synchronized int size(){
        return size;
    }

    // 模拟使用自定义阻塞队列
    public static void main(String[] args) {
        MyBlockingQueue<Integer> queue=new MyBlockingQueue<>(100);
        for(int i=0;i<5;i++){
            new Thread(()->{
                try {
                    while(true){
                        synchronized (queue){
                            queue.put(1);
                            System.out.println("存放面包+1："+queue.size());
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        for(int i=0;i<20;i++){
            new Thread(()->{
                try {
                    while(true){
                        synchronized (queue){
                            Integer e = queue.take();
                            System.out.println("消费面包-1："+queue.size());
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
