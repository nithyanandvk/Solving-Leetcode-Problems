class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<mat.length;i++){
            sum=sum+mat[i][i]+(i!=n-i-1?(mat[i][n-i-1]):0);
        }
        return sum;
    }
}