package 算法;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class manyChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int max=0;
        char ans=' ';
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else{
                int count=map.get(str.charAt(i))+1;
                map.put(str.charAt(i),count);
            }
            if(max<map.get(str.charAt(i))){
                max=map.get(str.charAt(i));
                ans=str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
