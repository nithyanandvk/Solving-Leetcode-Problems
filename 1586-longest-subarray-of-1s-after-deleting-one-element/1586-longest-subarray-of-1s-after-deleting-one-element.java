class Solution {
    public int longestSubarray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int c=0;
        int l=0;
        int r=0;
        int k=0;
        int n=nums.length;
        while(r<n){
            if(nums[r]==1){
                c++;
                r++;
            }else{
                if(k==0){
                    k++;
                    r++;
                }else{
                    while(nums[l]!=0){
                        l++;
                        c--;
                    }
                    l++;
                    k=0;
                }
            }
            if(max<c){
                max=c;
            }
        }
        if(max==n){
            return n-1;
        }
        return max;
    }
}