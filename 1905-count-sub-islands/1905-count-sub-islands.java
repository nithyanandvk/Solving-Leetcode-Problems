class Solution {
    static boolean check = false;

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int ans = 0;
        int n = grid1.length;
        int m = grid1[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid2[i][j] == 1) {
                    check = true;
                    dfs(grid1, grid2, i, j, n, m);
                    if (check) {
                        ans++;
                    }
                }

            }
        }
        return ans;
    }

    public static void dfs(int x[][], int grid[][], int i, int j, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0) {
            return;
        }
        grid[i][j] = 0;
        if (x[i][j] == 0) {
            check = false;
        }
        dfs(x, grid, i + 1, j, n, m);
        dfs(x, grid, i - 1, j, n, m);
        dfs(x, grid, i, j + 1, n, m);
        dfs(x, grid, i, j - 1, n, m);
    }
}