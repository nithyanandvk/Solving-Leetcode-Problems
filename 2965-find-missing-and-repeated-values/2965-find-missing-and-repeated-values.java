class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int sum=0;
        int freq[]=new int[n*n+1];
        int ans[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int x=grid[i][j];
                freq[x]++;
                sum=sum+x;
                if(freq[x]==2){
                    ans[0]=x;
                }
            }
        }
        
        sum=sum-ans[0];
        n=n*n;
        n=n*(n+1);
        n=n/2;
        ans[1]= n-sum;
        return ans;
    }
}