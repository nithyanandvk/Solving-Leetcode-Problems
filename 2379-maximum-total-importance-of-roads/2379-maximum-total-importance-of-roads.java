class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long arr[]=new long[n];
        for(int i=0;i<roads.length;i++){
            arr[roads[i][0]]++;
            arr[roads[i][1]]++;
        }
        long ans=0;
        Arrays.sort(arr);
        int x=1;
        for(int i=0;i<n;i++){
            ans=ans+arr[i]*x++;
        }
        return ans;
    }
}