class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int q=queries.length;
        int n=nums.length;
        int mod=1000000007;
        for(int i=0;i<q;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            int k=queries[i][2];
            int v=queries[i][3];
            for(int j=l;j<=r;j=j+k){
                nums[j]=(int)((long)nums[j] * v % mod); 
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}