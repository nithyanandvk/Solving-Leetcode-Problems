class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int l = 0;
        int r = 0;
        int a = 0;
        int b = 0;
        int mid = (m + n) / 2;
        for (int c = 0; c <= mid; c++) {
            b=a;
            if(l!=m && r!=n){
                if(nums1[l]<=nums2[r]){
                    a=nums1[l];
                    l++;
                }else{
                    a=nums2[r];
                    r++;
                }
            }else if(l==m){
                a=nums2[r++];
            }else{
                a=nums1[l++];
            }
        }
        if((m+n)%2==0){
            return (a+b)/(double)2;
        }else{
            return a;
        }
    }
}