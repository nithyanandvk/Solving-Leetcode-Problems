class Solution {
    class Pair {
        int x;
        int y;
        int data;

        Pair(int x, int y, int data) {
            this.x = x;
            this.y = y;
            this.data = data;
        }
    }

    public int[][] highestPeak(int[][] w) {
        int m = w.length;
        int n = w[0].length;
        int ans[][] = new int[m][n];
        for (int arr[] : ans) {
            Arrays.fill(arr, -1);
        }
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (w[i][j] == 1) {
                    ans[i][j] = 0;
                    q.add(new Pair(i, j, 0));
                }
            }
        }
        int dx[] = { -1, 0, 1, 0 };
        int dy[] = { 0, 1, 0, -1 };
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = curr.x + dx[i];
                int ny = curr.y + dy[i];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && ans[nx][ny] == -1) {
                    ans[nx][ny] = curr.data + 1;
                    q.add(new Pair(nx, ny, curr.data + 1));
                }
            }
        }
        return ans;
    }
}