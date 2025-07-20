class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0,r=n-1;
        double arr[]=new double[n/2];
        while(l<r){
            arr[l]=(nums[l]+nums[r])/(double)2;
            l++;
            r--;
        }
        double min=Integer.MAX_VALUE;
        for(int i=0;i<n/2;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
}