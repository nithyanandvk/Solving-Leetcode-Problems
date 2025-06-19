class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int c = 1;
        int x = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - x > k) {
                c++;
                x = nums[i];
            }
        }
        return c;
    }
}