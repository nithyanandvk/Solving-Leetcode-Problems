class Solution {
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean vis[][] = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {
                rec(grid, i, 0, vis);
            }
            if (grid[i][n - 1] == 0) {
                rec(grid, i, n - 1, vis);
            }
        }

        for (int i = 0; i < n; i++) {
            if (grid[0][i] == 0) {
                rec(grid, 0, i, vis);
            }
            if (grid[m - 1][i] == 0) {
                rec(grid, m - 1, i, vis);
            }
        }
        // for(int arr[]:grid){
        //     System.out.println(Arrays.toString(arr));
        // }
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    rec(grid,i,j,vis);
                    c++;
                }                
            }
        }
        return c;
    }

    public void rec(int grid[][],int r,int c,boolean vis[][]){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]==1 || vis[r][c]){
            return;
        }
        vis[r][c]=true;
        grid[r][c]=1;
        rec(grid,r+1,c,vis);
        rec(grid,r-1,c,vis);
        rec(grid,r,c-1,vis);
        rec(grid,r,c+1,vis);
    }
}