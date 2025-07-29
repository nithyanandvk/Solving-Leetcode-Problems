class Solution {
    public int change(int am, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n+1][am+1];
        for(int i=1;i<=n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            int c=coins[i-1];
            for(int j=1;j<=am;j++){
                if(c<=j){
                    dp[i][j]=dp[i-1][j]+dp[i][j-c];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][am];
    }
}