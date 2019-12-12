package demo1;
import java.util.Random;
import java.util.ArrayList;
//题目：生成6个【1，33】之间的随机数，添加到集合，并遍历集合
public class DemoArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        for(int i=0;i<6;i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }
        for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
