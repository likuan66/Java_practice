package day03;



public class reverseOnly {
    public static void main(String[] args) {
        String s="ab1cd";
        System.out.println(reverseOnlyLetters(s));
    }
    public static String reverseOnlyLetters(String S) {
        char[] arr=S.toCharArray();
        int i=0,j=arr.length-1;
        char temp='0';
        while(i<j){
            while(!(('a'<=arr[i]&&arr[i]<='z')||('A'<=arr[i]&&arr[i]<='Z'))&&i<j){
                i++;
            }
            while(!(('a'<=arr[j]&&arr[j]<='z')||('A'<=arr[j]&&arr[j]<='Z'))&&i<j){
                j--;
            }
            if(i<j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }

}
