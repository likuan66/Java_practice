public class MyHashMap {
    static class Node{
        public int key;
        public int value;
        public Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private Node[] array=new Node[101];
    private int size=0;//表示 当前hash表中的元素个数

    private static final double LOAD_FACTOR=0.75;

    private int hashFunc(int key){
        return key%array.length;
    }
    //如果key已经存在就修改当前的value值
    //如果key不存在 就插入新的键值对
    public void put(int key,int value){
        //需要把key映射成数组下标
        int index=hashFunc(key);
        //根据下标找到对应的链表
        Node list=array[index];
        //当前的key在链表中是否存在
        for(Node cur=list;cur!=null;cur=cur.next){
            if(cur.key==key){
                //key已经存在直接修改value
                cur.value=value;
                return ;
            }
        }
        //如果结束都没找到，相同的key节点，直接插入到指定链表的头部
        Node newNode=new Node(key,value);
        newNode.next=list;
        array[index]=newNode;
        size++;
        if(size/array.length>LOAD_FACTOR){
            resize();
        }
    }

    //扩容
    public void resize(){
        Node[] newArray=new Node[array.length*2];
        //把原来的hash'表中的元素搬运到新的数组上
        for(int i=0;i<array.length;i++){
            for(Node cur=array[i];cur!=null;cur=cur.next){
                int index=cur.key%newArray.length;
                Node newNode=new Node(cur.key,cur.value);
                newNode.next=newArray[index];
                newArray[index]=newNode;
            }
        }
    }
    //根据key查找指定的元素，如果找到返回对应的value值，如果没找到返回null
    public Integer get(int key){
        //先计算key对应的下标
        int index=hashFunc(key);
        //根据下标找到对应的链表
        Node list=array[index];
        //在链表中查找指定元素
        for(Node cur=list;cur!=null;cur=cur.next){
            if(cur.key==key){
                return cur.value;
            }
        }
        return null;
    }
}
