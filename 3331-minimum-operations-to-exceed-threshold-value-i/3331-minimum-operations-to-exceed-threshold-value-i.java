class Solution {
    public int minOperations(int[] nums, int k) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<k){
                c++;
            }
        }
        return c;
    }
}