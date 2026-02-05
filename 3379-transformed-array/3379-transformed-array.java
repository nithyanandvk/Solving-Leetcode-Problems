class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                ans[i]=0;
            }else if(nums[i]>0){
                int x=i;
                x=(x+nums[i])%n;
                ans[i]=nums[x];
            }else{
                int x=i;
                x=(x-Math.abs(nums[i]))%n;
                if(x<0){
                    x=x+n;
                }
                ans[i]=nums[x];
            }
        }
        return ans;
    }
}