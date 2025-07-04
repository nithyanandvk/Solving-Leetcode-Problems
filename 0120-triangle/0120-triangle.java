class Solution {
    public int minimumTotal(List<List<Integer>> arr) {
        int n=arr.size();
        int[][] dp = new int[n][n];
        dp[0][0] = arr.get(0).get(0); 

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + arr.get(i).get(j);
                } else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + arr.get(i).get(j);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) +arr.get(i).get(j);
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            min = Math.min(min, dp[n - 1][j]);
        }
        return min;
    }
}