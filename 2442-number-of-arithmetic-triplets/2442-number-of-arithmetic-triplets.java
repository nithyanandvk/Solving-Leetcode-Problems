class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            int a = nums[i];
            for (int j = i + 1; j < n - 1; j++) {
                int b = nums[j];
                for (int k = j + 1; k < n; k++) {
                    int c = nums[k];
                    if (b - a == diff && c - b == diff) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}