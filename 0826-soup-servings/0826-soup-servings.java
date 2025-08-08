class Solution {
    static public double dp[][];
    public double soupServings(int n) {
        if (n > 5000) {
            return 1;
        }
        n = (n + 24) / 25;
        dp = new double[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1.0;
            }
        }
        return rec(n, n);
    }
    public static double rec(int a, int b) {
        if (a <= 0 && b <= 0) {
            return 0.5;
        } else if (a <= 0) {
            return 1.0;
        } else if (b <= 0) {
            return 0.0;
        }
        if (dp[a][b] != -1.0) {
            return dp[a][b];
        }
        double ans = 0.25 * (rec(a - 4, b) + rec(a - 3, b - 1) + rec(a - 2, b - 2) + rec(a - 1, b - 3));
        dp[a][b] = ans;
        return ans;
    }
}
