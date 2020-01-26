package demo12;

class Node{
    public int data;
    public Node next=null;
    public Node(int data){
        this.data=data;
    }
}
public class SingleLinkedList {

    private Node head=null;
    //头插法
    public void addFist(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }
    //尾插
    public void addLast(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        //如果链表不为空，首先找到尾节点
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        //循环结束之后，tail就是对应的最后一个节点
        tail.next=node;

    }
    public boolean addIndex(int index,int data){
        int size=size();
        if(index<0||index>size){
            return false;
        }
        if(index==0){
            addFist(data);
            return true;
        }
        if(index==size){
            addLast(data);
            return true;
        }
        Node node=new Node(data);
        //如果index为中间位置，先找到index的前一个节点index-1
        Node prev=getPos(index-1);
        //接下来就是把新节点插入到prev之后
        node.next=prev.next;
        prev.next=node;
        return true;
    }
    public boolean contains(int key){
        for(Node cur=head;cur!=null;cur=cur.next){
            if(cur.data==key) {
                return true;
            }
        }
        return false;
    }
    public void remove(int key){
        //如果要删除的元素是头节点，特殊处理
        if(head.data==key){
            head=head.next;
            return ;
        }
        //如果要删除的元素不是头节点，找到要删除的节点的前一个位置
        Node prev=searchPrve(key);
        //修改引用的指向，完成删除
        //prev.next=prev.next.next;
        Node toDelete=prev.next;
        prev.next=toDelete.next;
    }

    private Node searchPrve(int key) {
        //找到key的前一个节点的位置
        for(Node cur=head;cur!=null&&cur.next!=null;cur=cur.next){
            if(cur.next.data==key){
                return cur;
            }
        }
        return null;
    }

    private Node getPos(int index){
        Node cur=head;
        for(int i=0;i<index;i++){
            //cur.next操作之前必须保证cur非空
            cur=cur.next;
        }
        return cur;
    }
    public void display() {
        for(Node cur=head;cur!=null;cur=cur.next){
            System.out.print(cur.data+" ");
        }
        System.out.println();
    }
    public int  size(){
        int size=0;
        for(Node cur=head;cur!=null;cur=cur.next){
            size++;
        }
        return size;
    }
}
