class Solution {
    static class Pair {
        int x;
        int y;
        int r;

        Pair(int x, int y, int r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }
    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
        Queue<Pair> q = new LinkedList<Pair>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = true;
                }
            }
        }
        int dx[] = { 0, 0, -1, 1 };
        int dy[] = { -1, 1, 0, 0 };
        int max = 0;
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = curr.x + dx[i];
                int ny = curr.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && !vis[nx][ny] && grid[nx][ny] != 0) {
                    q.add(new Pair(nx, ny, curr.r + 1));
                    vis[nx][ny]=true;
                    max = Math.max(max, curr.r + 1);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]==1){
                    return -1;
                }
            }
        }
        return max;
    }
}