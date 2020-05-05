import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"hello");
        map.put(2,"word");
        map.put(3,"heheh");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(8));
        //打印所有的key
        for(Integer key:map.keySet()){
            System.out.println(key);
        }
        //打印所有的value
        for(String value:map.values()){
            System.out.println(value);
        }
        //按key-value的映射打印
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
