class Solution {
    public int minimumArea(int[][] grid) {
        int minx = Integer.MAX_VALUE;
        int maxx = Integer.MIN_VALUE;
        int miny = Integer.MAX_VALUE;
        int maxy = Integer.MIN_VALUE;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    minx = Math.min(minx, i);
                    maxx = Math.max(maxx, i);
                    miny = Math.min(miny, j);
                    maxy = Math.max(maxy, j);
                }
            }
        }
        if (maxx == Integer.MIN_VALUE) {
            maxx = minx;
        }
        if (minx == Integer.MAX_VALUE) {
            minx = maxx;
        }
        if (maxy == Integer.MIN_VALUE) {
            maxy = miny;
        }
        if (minx == Integer.MAX_VALUE) {
            miny = maxy;
        }
        return ((maxx - minx + 1) * (maxy - miny + 1));
    }
}