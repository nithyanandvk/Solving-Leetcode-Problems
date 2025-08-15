class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int ans[][] = new int[m][n];
        int dx[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
        int dy[] = { 1, 1, 1, 0, 0, -1, -1, -1 };
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int c = 0;
                for (int x = 0; x < 8; x++) {
                    int nx = i + dx[x];
                    int ny = j + dy[x];
                    if (nx >= 0 && nx < m && ny >= 0 && ny < n && board[nx][ny] == 1) {
                        c++;
                    }
                }
                if(board[i][j]==1 && (c==2 || c==3)){
                    ans[i][j]=1;
                }
                if(board[i][j]==0 && c==3){
                    ans[i][j]=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j]=ans[i][j];
            }
        }
    }
}