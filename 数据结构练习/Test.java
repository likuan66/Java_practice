
import java.util.*;

class Node{
    int val;
    Node next;
    Node random;

    public Node( Node next, Node random) {
        this.next = next;
        this.random = random;
    }

    public Node(int val) {
        this.val=val;
    }
}
public class Test {
    //只出现一次的数字
    public static int singleNumber(int[] nums){
        int a=0;
        for(int i: nums){
            a^=i;
        }
        return a;
    }
    //复制带随机指针的链表
    public Node copyRandomList(Node head){
        //遍历旧连表，吧旧连表的节点依次插入到map中，key是旧链表的节点，value是拷贝出来的新链表的节点、
        Map<Node,Node> map=new HashMap<>();
        for(Node cur=head;cur!=null;cur=cur.next){
            map.put(cur,new Node(cur.val));
        }
        //再次遍历链表修改新链表中的next和random
        for(Node cur=head;cur!=null;cur=cur.next){
            Node newCur=map.get(cur);
            newCur.next=map.get(cur.next);
            newCur.random=map.get(cur.random);
        }
        return map.get(head);
    }
    //石头与宝石问题
    public int numJewelsInStones(String J, String S){
        Set<Character> set=new HashSet<>();
        for(Character c:J.toCharArray()){
            set.add(c);
        }
        int count=0;
        for(Character ch:S.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    }
    //换键盘打字

    public static void main(String[] args) {
        //int[] arr={1,2,3,4,4,2,3};
        //System.out.println(singleNumber(arr));
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String expected=sc.next();
            String actual=sc.next();
            expected=expected.toUpperCase();
            actual=actual.toUpperCase();
           // 创建一个set保存实际那些字符输出了
            Set<Character> set=new HashSet<>();
            for(int i=0;i<actual.length();i++){
                set.add(actual.charAt(i));
            }
            // 遍历预期输出的字符串, 看看哪个字符没有被实际输出
            Set<Character> brokenKeySet=new HashSet<>();
            for(int i=0;i<expected.length();i++){
                char c=expected.charAt(i);
                if(set.contains(c)){
                    // 当前字符已经被输出了, 就是一个好的键.
                    continue;
                }
                if(brokenKeySet.contains(c)){
                    // 此处的 brokenKeySet 用于辅助去重. 防止同一个坏键被打印多次
                    continue;
                }
                System.out.print(c);
                brokenKeySet.add(c);
            }
        }
    }
}
