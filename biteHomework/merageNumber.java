package biteHomework;

public class merageNumber {
    public static void main(String[] args) {
        int[] a={1,2,3,0,0,0};
        int m=3;
        int[] b={2,4,5};
        int n=3;
        merge(a,m,b,n);
        for(int c:a){
            System.out.print(c+" ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int p=m--+n---1;
        while(m>=0&&n>=0){
            nums1[p--]=nums1[m]>nums2[n]?nums1[m--]:nums2[n--];
        }
        while(n>=0){
            nums1[p--]=nums2[n--];
        }
    }
}
