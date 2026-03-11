class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans = 0;
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int a = nums[l];
            int b = nums[r];
            int x = Integer.toString(b).length();
            int xx = a * (int) Math.pow(10, x) + b;
            ans = ans + xx;
            l++;
            r--;
        }
        if (l == r) {
            ans = ans + nums[l];
        }
        return ans;
    }
}