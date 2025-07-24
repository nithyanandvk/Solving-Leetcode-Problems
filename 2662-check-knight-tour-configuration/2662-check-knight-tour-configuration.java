class Solution {
    static int dx[]={-2,-2,-1,1,2,2,1,-1};
    static int dy[]={-1,1,2,2,1,-1,-2,-2};
    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) return false;
        return rec(grid,0,0,0);
    }
    public static boolean rec(int grid[][],int r,int c,int n){
        if(n==grid.length*grid.length-1){
            return true;
        }
        for(int i=0;i<8;i++){
            if(r+dx[i] < grid.length && r+dx[i] >=0 &&  c+dy[i] < grid.length && c+dy[i] >=0 && grid[r+dx[i]][c+dy[i]]==n+1){
                return rec(grid,r+dx[i],c+dy[i],n+1);
            }
        }
        return false;
    }
}