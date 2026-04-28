class Solution {
    public int minOperations(int[][] grid, int x) {
        int r = grid[0][0] % x;
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] % x != r) {
                    return -1;
                }
            }
        }
        ArrayList<Integer> l = new ArrayList<>();
        for (int[] row : grid) {
            for (int val : row) {
                l.add(val);
            }
        }

        Collections.sort(l);

        int median = l.get(l.size() / 2);

        int ans = 0;
        for (int val : l) {
            ans += Math.abs(val - median) / x;
        }

        return ans;
    }
}