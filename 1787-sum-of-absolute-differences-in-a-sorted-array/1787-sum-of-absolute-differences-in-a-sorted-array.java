class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        // for(int i=0;i<n;i++){
        //     int r=0;
        //     int x=nums[i];
        //     for(int j=0;j<n;j++){
        //         r=r+Math.abs(x-nums[j]);
        //     }
        //     ans[i]=r;
        // }
        int pre[] = new int[n];
        int suf[] = new int[n];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = ((nums[i] * i) - pre[i]) + (suf[i] - (nums[i] * (n - i - 1)));
        }
        return ans;
    }
}