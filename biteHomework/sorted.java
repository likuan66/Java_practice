package day03;

import java.util.Arrays;

public class sorted {
    public static void main(String[] args) {
        int[] arr={-1,-2,0,4,5};
        sortedSquares(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    public static int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++){
            A[i]=A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
