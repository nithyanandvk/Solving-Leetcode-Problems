class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int k) {
        if(k==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(k)){
            return false;
        }
        char c=word.charAt(k);
        board[i][j]='.';        
        boolean f=dfs(board,word,i+1,j,k+1) ||
                  dfs(board,word,i,j+1,k+1) ||
                  dfs(board,word,i-1,j,k+1) || 
                  dfs(board,word,i,j-1,k+1);
        if(f){
            return true;
        }
        board[i][j]=c;
        return false;
    }
}
