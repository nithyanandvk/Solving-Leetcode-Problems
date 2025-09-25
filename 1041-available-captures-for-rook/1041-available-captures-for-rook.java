class Solution {
    public int numRookCaptures(char[][] board) {
        int r = 0;
        int c = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    r = i;
                    c = j;
                    break;
                }
            }
        }
        int ans = 0;
        for (int i = r - 1; i >= 0; i--) {
            if (board[i][c] == 'B') {
                break;
            } else if (board[i][c] == 'p') {
                ans++;
                break;
            }
        }
        for (int i = r + 1; i < 8; i++) {
            if (board[i][c] == 'B') {
                break;
            } else if (board[i][c] == 'p') {
                ans++;
                break;
            }
        }
        for (int i = c - 1; i >= 0; i--) {
            if (board[r][i] == 'B') {
                break;
            } else if (board[r][i] == 'p') {
                ans++;
                break;
            }
        }
        for (int i = c + 1; i < 8; i++) {
            if (board[r][i] == 'B') {
                break;
            } else if (board[r][i] == 'p') {
                ans++;
                break;
            }
        }
        return ans;
    }
}