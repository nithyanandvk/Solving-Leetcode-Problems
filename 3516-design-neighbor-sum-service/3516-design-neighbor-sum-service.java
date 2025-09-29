class NeighborSum {
    int arr[][];
    public NeighborSum(int[][] grid) {
        arr=grid;
    }
    
    public int adjacentSum(int value) {
        int sum=0;
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==value){
                    if(i+1<n){
                        sum=sum+arr[i+1][j];
                    }
                    if(i-1>=0){
                        sum=sum+arr[i-1][j];
                    }
                    if(j+1<m){
                        sum=sum+arr[i][j+1];
                    }
                    if(j-1>=0){
                        sum=sum+arr[i][j-1];
                    }
                    break;
                }
            }
        }
        return sum;
    }
    
    public int diagonalSum(int value) {
        int sum=0;
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==value){
                    if(i+1<n && j+1<m){
                        sum=sum+arr[i+1][j+1];
                    }
                    if(i+1<n && j-1>=0){
                        sum=sum+arr[i+1][j-1];
                    }
                    if(i-1>=0 && j-1>=0){
                        sum=sum+arr[i-1][j-1];
                    }
                    if(i-1>=0 && j+1<m){
                        sum=sum+arr[i-1][j+1];
                    }
                    break;
                }
            }
        }
        return sum;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */