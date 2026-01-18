class Solution {
    public int largestMagicSquare(int[][] grid) {
        int ans = 1;
        int m = grid.length;
        int n = grid[0].length;
        int max = Math.min(m, n);
        for (int s = max; s >= 2; s--) {
            for (int i = 0; i <= m - s; i++) {
                for (int j = 0; j <= n - s; j++) {
                    int x = 0;
                    boolean check = false;
                    for (int r = i; r < i + s; r++) {
                        int curr = 0;
                        for (int c = j; c < j + s; c++) {
                            curr = curr + grid[r][c];
                        }
                        if (!check) {
                            x = curr;
                            check = true;
                        }
                        if (x != curr) {
                            check = false;
                            break;
                        }
                    }
                    if (!check) {
                        continue;
                    }

                    for (int c = j; c < j + s; c++) {
                        int curr = 0;
                        for (int r = i; r < i + s; r++) {
                            curr = curr + grid[r][c];
                        }
                        if (x != curr) {
                            check = false;
                            break;
                        }
                    }

                    if (!check) {
                        continue;
                    }
                    int d = 0, e = 0;
                    for (int k = 0; k < s; k++) {
                        d += grid[i + k][j + k];
                        e += grid[i + k][j + s - 1 - k];
                    }
                    if (d != x || e != x) {
                        continue;
                    }
                    ans = s;
                    return ans;
                }
            }
        }
        return ans;
    }
}