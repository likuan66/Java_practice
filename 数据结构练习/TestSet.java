import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("hello");
        set.add("word");
        set.add("hehe");
        set.add("hello");
        System.out.println(set);
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
