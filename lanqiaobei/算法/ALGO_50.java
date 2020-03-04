package lanqiao;

import java.util.Arrays;
import java.util.Scanner;
public class ALGO_50 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int num = reader.nextInt();
        int n = reader.nextInt();

        if (num > 0) {
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = reader.nextInt();
            }

            lanqiao_1110(arr, n);							//调用函数
        }

    }

    public static void lanqiao_1110(int[] arr, int k) {
        int c = arr.length;									//获取数组的长度

        for (int i = 0; i < arr.length; i++) {				//循环遍历查看是否能被k整除，并剔除
            if (arr[i] % k == 0) {
                arr[i] = -1;
                c--;
            }
        }

        Arrays.sort(arr);									//进行从小到大排序

        for (int i = arr.length - c; i < arr.length; i++) {		//循环遍历输出结果
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                System.out.print((char) arr[i] + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }

}


