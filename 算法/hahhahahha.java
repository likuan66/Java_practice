package 算法;

import java.util.Scanner;

public class hahhahahha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] s=new int[n-1];
        for(int i=0;i<n-1;i++){
            s[i]=sc.nextInt();
        }
        int count=0;
        int m=0;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                if(s[i]==0&&s[j]!=0){
                    count++;
                } else if(s[i]!=0&&s[j]==0){
                    m=j;
                    count=Math.max(j-i,n-1-i);
                }
            }
        }
        System.out.println(count);
    }
}
