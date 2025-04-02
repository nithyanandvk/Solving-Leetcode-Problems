class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    long maxi =(long) (nums[i] - nums[j]) * nums[k];
                    max = Math.max(max, maxi);
                }
            }
        }
        return max;
    }
}