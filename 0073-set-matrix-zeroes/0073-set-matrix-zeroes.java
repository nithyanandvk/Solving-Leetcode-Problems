class Solution {
    public void setZeroes(int[][] arr) {
        int r = arr.length, n = arr[0].length;
        int m[][] = new int[r][n];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = arr[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    for (int x = 0; x < n; x++) {
                        m[i][x] = 0;
                    }
                    for (int x = 0; x < r; x++) {
                        m[x][j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = m[i][j];
            }
        }
    }
}