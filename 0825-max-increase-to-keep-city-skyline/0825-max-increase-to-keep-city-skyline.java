class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int r[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            int max=grid[i][0];
            for(int j=0;j<n;j++){
                if(grid[i][j]>max){
                    max=grid[i][j];
                }
            }
            r[i]=max;
        }

        for(int i=0;i<n;i++){
            int max=grid[0][i];
            for(int j=0;j<n;j++){
                if(grid[j][i]>max){
                    max=grid[j][i];
                }
            }
            c[i]=max;
        }
        // System.out.println(Arrays.toString(r));
        // System.out.println(Arrays.toString(c));
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans=ans+(grid[i][j]<Math.min(r[i],c[j])?Math.min(r[i],c[j])-grid[i][j]:0);
            }
        }
        return ans;
    }
}