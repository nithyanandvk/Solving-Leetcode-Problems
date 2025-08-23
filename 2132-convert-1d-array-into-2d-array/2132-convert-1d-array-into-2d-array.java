class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int ans[][]=new int[m][n];
        int c=0;
        int x=original.length;
        if(x>m*n){
            return new int[0][0];
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(c>=x){
                    return new int[0][0];
                }
                ans[i][j]=original[c++];
            }
        }
        return ans;
    }
}