class Solution {
    public int[] countPoints(int[][] p, int[][] q) {
        int n = q.length;
        int m = p.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < m; j++) {
                int x = (p[j][0] - q[i][0]);
                int y = (p[j][1] - q[i][1]);
                int z=q[i][2];
                if ((x * x + y * y) <= z*z) {
                    c++;
                }
            }
            ans[i] = c;
        }
        return ans;
    }
}