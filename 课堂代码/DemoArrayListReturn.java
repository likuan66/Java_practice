package demo1;
import java.util.ArrayList;
import java.util.Random;
/*
题目：用一个大集合存入20个随机数，然后筛选其中的偶数元素，放置到小集合中，
要求使用自定义的方法来筛选
*/
public class DemoArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random n=new Random();
        for(int i=0;i<20;i++){
            int num=n.nextInt(100)+1;
            list.add(num);
        }
        ArrayList<Integer> smallList=getSamllList(list);
        System.out.println("偶数一共有多少个："+smallList.size());
        for (int i=0;i<smallList.size();i++){
            System.out.print(smallList.get(i)+" ");
        }
    }
    //这个方法接受大集合参数返回小集合结果
    public static ArrayList<Integer> getSamllList(ArrayList<Integer> list){
        ArrayList<Integer> smallList=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            int number=list.get(i);
            if(number%2==0){
                smallList.add(number);
            }
        }
        return smallList;
    }
}
