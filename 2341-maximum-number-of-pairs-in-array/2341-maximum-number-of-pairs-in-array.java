class Solution {
    public int[] numberOfPairs(int[] nums) {
        int ans[]=new int[2];
        int freq[]=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<101;i++){
            ans[0]=ans[0]+freq[i]/2;
            if(freq[i]%2==1){
                ans[1]++;
            }
        }
        return ans;
    }
}