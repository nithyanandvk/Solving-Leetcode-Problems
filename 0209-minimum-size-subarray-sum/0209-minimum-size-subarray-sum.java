class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int l=0;
        int sum=0;
        for(int r=0;r<n;r++){
            sum=sum+nums[r];
            while(sum>=target){
                if(min>(r-l+1)){
                    min=r-l+1;
                }
                sum=sum-nums[l];
                l++;
            }
        }
        min= min==Integer.MAX_VALUE? 0 :min;
        return min;
    }
}