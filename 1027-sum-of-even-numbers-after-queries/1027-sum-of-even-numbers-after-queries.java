class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n=nums.length;
        int q=queries.length;
        int ans[]=new int[q];
        // for(int i=0;i<q;i++){
        //     nums[queries[i][1]]+=queries[i][0];
        //     ans[i]=sum(nums);
        // }
        int sum=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                sum=sum+nums[i];
            }
        }
        for(int i=0;i<q;i++){
            int val=queries[i][0];
            int idx=queries[i][1];
            if(nums[idx]%2==0){
                sum=sum-nums[idx];
            }
            nums[idx]=nums[idx]+val;
            if(nums[idx]%2==0){
                ans[i]=nums[idx]+sum;
                sum=sum+nums[idx];
            }else{
                ans[i]=sum;
            }
        }
        return ans;

    }
    public static int sum(int arr[]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                sum=sum+arr[i];
            }
        }
        return sum;
    }
}