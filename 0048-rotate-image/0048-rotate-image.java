class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int trans[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                trans[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<n;i++){
            int l=0,r=n-1;
            while(l<=r){
                int temp=trans[i][l];
                trans[i][l]=trans[i][r];
                trans[i][r]=temp;
                l++;
                r--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=trans[i][j];
            }
        }        
    }
}