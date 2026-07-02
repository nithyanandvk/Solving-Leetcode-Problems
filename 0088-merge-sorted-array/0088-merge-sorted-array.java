class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m-1;
        int r=n-1;
        int x=m+n-1;
        while(l>=0 && r>=0){
            if(nums1[l]>=nums2[r]){
                nums1[x]=nums1[l];
                l--;
                x--;
            }else{
                nums1[x]=nums2[r];
                r--;
                x--;
            }
            // System.out.println(Arrays.toString(nums1));
        }
        while (r >= 0) {
            nums1[x] = nums2[r];
            r--;
            x--;
        }
    }
}