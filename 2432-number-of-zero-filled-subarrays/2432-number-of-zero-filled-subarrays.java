class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c=c+1;
                ans=ans+c;
            }else{
                c=0;
            }
        }
        return ans;
    }
}