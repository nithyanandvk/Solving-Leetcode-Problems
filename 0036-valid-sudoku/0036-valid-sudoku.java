class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    char x=board[i][j];
                    board[i][j]='.';
                    if(!check(board,x,i,j)){
                        return false;
                    }
                    board[i][j]=x;
                }
            }
        }
        return true;
    }
    static boolean check(char mat[][], char d, int x, int y) {
        for (int i = 0; i < 9; i++) {
            if (mat[i][y] == d) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (mat[x][i] == d) {
                return false;
            }
        }
        int nx = x / 3 * 3;
        int ny = y / 3 * 3;
        for (int i = nx; i < nx + 3; i++) {
            for (int j = ny; j < ny + 3; j++) {
                if (mat[i][j] == d) {
                    return false;
                }
            }
        }
        return true;
    }
}