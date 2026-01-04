class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        int ans[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int x=Math.max(0,i-k);
                int y=Math.min(n-1,i+k);
                int a=Math.max(0,j-k);
                int b=Math.min(m-1,j+k);
                for(int kk=x;kk<=y;kk++){
                    for(int l=a;l<=b;l++){
                        ans[i][j]=ans[i][j]+mat[kk][l];
                    }
                }
            }
        }
        return ans;
    }
}