class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    count=Math.max(count,rec(grid,i,j,m,n));
                }
            }
        }
        return count;
    }
    public static int rec(int grid[][],int x,int y,int m,int n){
        if(x<0 || y<0 || x>=m || y>=n || grid[x][y]==0){
            return 0;
        }
        grid[x][y]=0;
        int a=rec(grid,x+1,y,m,n);
        int b=rec(grid,x-1,y,m,n);
        int c=rec(grid,x,y+1,m,n);
        int d=rec(grid,x,y-1,m,n);
        return 1+a+b+c+d;
    }
}