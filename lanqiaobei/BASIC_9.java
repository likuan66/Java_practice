package lanqiao;

import java.util.Scanner;

public class BASIC_9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        //5位数
        for (int i = 1; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                for(int k = 0; k < 10; k++) {
                    if (2 * (i + j) + k == n) {
                        sum = i * 10001 + j * 1010 + k * 100;
                        System.out.println(sum);
                    }
                }
            }
        }

        //6位数
        for (int i = 1; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                for(int k = 0; k < 10; k++) {
                    if (2 * (i + j + k) == n) {
                        sum = i * 100001 + j * 10010 + k * 1100;
                        System.out.println(sum);
                    }
                }
            }
        }
    }
}
