class Solution {
    List<List<String>> ans;
    public List<List<String>> solveNQueens(int n) {
        ans=new ArrayList<>();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        nq(board,0);
        return ans;
    }
    public void nq(char board[][],int r){
        if(r==board.length){
            ArrayList<String> l=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                l.add(new String(board[i]));
            }
            ans.add(l);
            return;
        }
        for(int c=0;c<board.length;c++){
            if(isSafe(board,r,c)){
                board[r][c]='Q';
                nq(board,r+1);
                board[r][c]='.';
            }
        }
    }

    public static boolean isSafe(char board[][],int r,int c){
        for(int i=0;i<r;i++){
            if(board[i][c]=='Q'){
                return false;
            }        
        }
        for(int i=r-1,j=c-1;i>=0 && j>=0 ;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=r-1,j=c+1;i>=0 && j<board.length ;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}