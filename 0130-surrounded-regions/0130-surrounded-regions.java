class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<n;i++){
            if(board[0][i]=='O'){
                dfs(board,0,i,vis);
            }
            if(board[m-1][i]=='O'){
                dfs(board,m-1,i,vis);
            }
        }
        for(int i=0;i<m;i++){
            if(board[i][0]=='O'){
                dfs(board,i,0,vis);
            }
            if(board[i][n-1]=='O'){
                dfs(board,i,n-1,vis);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O' && !vis[i][j]){
                    board[i][j]='X';
                }
            }
        }
    }
    public void dfs(char board[][],int x,int y,boolean vis[][]){
        vis[x][y]=true;
        int dx[]={-1,1,0,0};
        int dy[]={0,0,1,-1};
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0 && nx<board.length && ny>=0 && ny<board[0].length && board[nx][ny]=='O' && !vis[nx][ny]){
                dfs(board,nx,ny,vis);
            }
        }
    }
}