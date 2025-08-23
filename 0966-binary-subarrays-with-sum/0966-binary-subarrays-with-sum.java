class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return rec(nums, goal) - rec(nums, goal - 1);
    }

    public int rec(int nums[], int goal) {
        if (goal < 0) {
            return 0;
        }
        int l = 0;
        int r = 0;
        int n = nums.length;
        int ans = 0;
        while (r < n) {
            goal = goal - nums[r];
            while (goal < 0) {
                goal = goal + nums[l++];
            }
            ans = ans + r - l + 1;
            r++;
        }
        return ans;
    }
}