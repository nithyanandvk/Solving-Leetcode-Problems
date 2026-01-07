class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int l=0;
        int z=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                break;
            }else if(nums[i]==0){
                z++;
            }else{
                l++;
            }
        }
        return Math.max(l,n-l-z);
    }
}