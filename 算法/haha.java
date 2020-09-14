package 算法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class haha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        while(num2>0){
            list.add(0,num2%10);
            num2/=10;
        }
        Collections.sort(list);
        int num=ifC(list,0,num1);
        System.out.println(num);
    }

    private static int ifC(List<Integer> list, int i, int num1) {
        if(i==list.size()){
            int sum=0;
            for(int j=0;j<list.size();j++){
                sum=sum*10+list.get(j);
            }
            if(num1<sum){
                return sum;
            }else{
                return -1;
            }
        }
        for(int j=i;j<list.size();j++){
            swap(list,j,i);
            int num=ifC(list,i+1,num1);
            if(num!=0){
                return num;
            }
            swap(list,j,i);
        }
        return -1;
    }

    private static void swap(List<Integer> list, int j, int i) {
        int temp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
}
