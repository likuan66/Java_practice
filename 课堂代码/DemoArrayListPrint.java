package demo1;
import java.util.ArrayList;
/*题目：定义指定格式打印集合的方法 （ArrayList类型作为参数），使用{}扩起集合，使用@分割每个元素
格式参照{元素@元素@元素}*/
public class DemoArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张天爱");
        list.add("颖儿");
        list.add("杨颖");
        list.add("徐冬冬");
        printArrayList(list);

    }
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for(int i=0;i<list.size();i++){
            String name=list.get(i);
            if(i==list.size()-1){
                System.out.print(name+"}");
            }
            else{
                System.out.print(name+"@");
            }
        }
    }
}
