class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int x=arr.length/20;
        int n=arr.length;
        double ans=0;
        for(int i=x;i<n-x;i++){
            ans=ans+arr[i];
        }
        return ans/(n-2*x);
    }
}