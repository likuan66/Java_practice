
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<String> set=new HashSet<>();
        while(sc.hasNext()){
            String str=sc.next();
            String[] arr=str.split(" ");
            for(int i=0;i<arr.length;i++){
                set.add(arr[i]);
            }
        }
        System.out.println(set.size());
    }
}
