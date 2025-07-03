class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m + n];
        int k = 0;
        int i,j;
        for (i = 0, j = 0; i < m && j < n; k++) {
            if (nums1[i] <= nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }
        }
        while (i < m) {
            arr[k++] = nums1[i++];
        }
        while (j < n) {
            arr[k++] = nums2[j++];
        }
        for(int x=0;x<m+n;x++){
            nums1[x]=arr[x];
        }
        //System.out.println(Arrays.toString(arr));
    }
}