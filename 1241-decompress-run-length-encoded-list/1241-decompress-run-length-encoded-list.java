class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            n = n + nums[i];
        }
        int ans[] = new int[n];
        int x = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            int f = nums[i];
            int v = nums[i + 1];
            for (int j = 0; j < f; j++) {
                ans[x++] = v;
            }
        }
        return ans;
    }
}