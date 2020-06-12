package bite每日一题;


import java.util.Scanner;

//输入n个整数，输出出现次数大于等于数组长度一半的数。
public class day07 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strs=str.split(" ");
        int[] arr=new int[strs.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.valueOf(strs[i]);
        }
        int num=arr[0];
        int count=0;

        for(int i=1;i<arr.length;i++) {
            if (arr[i] == num) {
                count++;
            } else if (count > 0) {
                count--;
            } else {
                num = arr[i];
            }
        }
        System.out.println(num);
    }
}
