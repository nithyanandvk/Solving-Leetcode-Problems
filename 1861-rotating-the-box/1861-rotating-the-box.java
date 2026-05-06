class Solution {
    public char[][] rotateTheBox(char[][] b) {
        int m = b.length, n = b[0].length;        
        for (int i = 0; i < m; i++) {
            int pos = n - 1;
            for (int j = n - 1; j >= 0; j--) {
                if (b[i][j] == '*') {
                    pos = j - 1;
                } else if (b[i][j] == '#') {
                    char t = b[i][j];
                    b[i][j] = '.';
                    b[i][pos] = t;
                    pos--;
                }
            }
        }        
        char[][] res = new char[n][m];        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][m - 1 - i] = b[i][j];
            }
        }
        
        return res;
    }
}