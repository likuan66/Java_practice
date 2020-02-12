package day03;



public class sortArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        sortArrayByParity(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] sortArrayByParity(int[] A) {
        int i = 0;

        int j = A.length - 1;

        while(i < j){
            if((A[i] % 2 == 1) && (A[j] % 2 == 0)){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j--;
                i++;
            }

            if(A[i] % 2 == 0){
                i++;
            }

            if(A[j] % 2 == 1){
                j--;
            }
        }

        return A;
    }
}
