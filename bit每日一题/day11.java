package bite每日一题;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//每个测试输入包含空格分割的n+1个整数，最后一个整数为k值,n
public class day11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        while(sc.hasNext()){
           list.add(sc.nextInt());
        }
        int k=list.get(list.size()-1);
        list.remove(list.size()-1);
        int[] array=new int[list.size()];
        for(int i=0;i<list.size();i++){
            array[i]=list.get(i);
        }
        Arrays.sort(array);
        for(int i=0;i<k-1;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(array[k-1]);
    }
}
