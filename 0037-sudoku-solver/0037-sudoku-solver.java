class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
    static boolean solve(char mat[][],int r,int c){
        if(r==9){
            return true;
        }
        int nc=c+1;
        int nr=r;
        if(nc==9){
            nc=0;
            nr=r+1;
        }
        if(mat[r][c]!='.'){
            return solve(mat,nr,nc);
        }
        for(char i='1';i<='9';i++){
            if(check(mat,i,r,c)){
                mat[r][c]=i;
                if(solve(mat,nr,nc)){
                    return true;
                }
                mat[r][c]='.';
            }
        }
        return false;
    }
    
    
    static boolean check(char mat[][],char d,int x,int y){
        for(int i=0;i<9;i++){
            if(mat[i][y]==d){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(mat[x][i]==d){
                return false;
            }
        }
        int nx=x/3*3;
        int ny=y/3*3;
        for(int i=nx;i<nx+3;i++){
            for(int j=ny;j<ny+3;j++){
                if(mat[i][j]==d){
                    return false;
                }
            }
        }
        return true;
    }
}