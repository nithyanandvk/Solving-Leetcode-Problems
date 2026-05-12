class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int a=0,b=0;
        for(int i=0;i<k;i++){
            a=a+nums[i];
        }
        for(int i=nums.length-1;i>nums.length-k-1;i--){
            b=b+nums[i];
        }       
        return Math.abs(a-b);
    }
}