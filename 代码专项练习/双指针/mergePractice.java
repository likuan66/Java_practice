package 代码专项练习.双指针;
//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
public class mergePractice {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num3=new int[m];
        System.arraycopy(nums1,0,num3,0,m);
        int p1=0;
        int p2=0;
        int p=0;
        while(p1<m&&p2<n){
            nums1[p++]=num3[p1]<nums2[p2]?num3[p1++]:nums2[p2++];
        }
        if(p2<n){
            System.arraycopy(nums2,p2,nums1,p1+p2,m+n-p1-p2);
        }
        if(p1<m){
            System.arraycopy(num3,p1,nums1,p1+p2,m+n-p1-p2);
        }
    }
}
