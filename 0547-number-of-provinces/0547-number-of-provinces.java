class Solution {
    public int findCircleNum(int[][] g) {
        int n = g.length;
        boolean[] vis = new boolean[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(g, i, vis);
                cnt++;
            }
        }
        return cnt;
    }

    public static void dfs(int[][] g, int u, boolean[] vis) {
        vis[u] = true;
        for (int v = 0; v < g.length; v++) {
            if (g[u][v] == 1 && !vis[v]) {
                dfs(g, v, vis);
            }
        }
    }
}
