class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int max=0;
        int c=0;
        while(r<nums.length){
            if(nums[r]==1){
                r++;
            }else if(nums[r]==0 && c<k){
                r++;
                c++;
            }else{
                max=Math.max(r-l,max);
                if(nums[l]==0){
                    c--;
                }
                l++;
            }
        }
        max = Math.max(max, r - l);
        return max;
    }
}