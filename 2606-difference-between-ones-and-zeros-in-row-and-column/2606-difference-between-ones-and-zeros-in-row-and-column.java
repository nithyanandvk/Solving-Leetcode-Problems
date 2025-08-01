class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ans[][]=new int[m][n];
        int oner[]=new int[m];
        int onec[]=new int[n];
        for(int i=0;i<m;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    c++;
                }
            }
            oner[i]=c;
        }

        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<m;j++){
                if(grid[j][i]==1){
                    c++;
                }
            }
           onec[i]=c;
        }
        //System.out.println(Arrays.toString(oner)+Arrays.toString(onec));
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=oner[i]+onec[j]-n+oner[i]-m+onec[j];
            }
        }
        return ans;
    }
}