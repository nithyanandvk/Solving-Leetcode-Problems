class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        boolean arr[]=new boolean[n*n+1];
        int ans[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[grid[i][j]]){
                    ans[0]=grid[i][j];
                }else{
                    arr[grid[i][j]]=true;
                }
            }
        }
        for(int i=1;i<n*n+1;i++){
            if(!arr[i]){
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}