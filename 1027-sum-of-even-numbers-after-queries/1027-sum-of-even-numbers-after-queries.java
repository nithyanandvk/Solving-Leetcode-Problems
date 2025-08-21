class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n=nums.length;
        int q=queries.length;
        int ans[]=new int[q];
        for(int i=0;i<q;i++){
            nums[queries[i][1]]+=queries[i][0];
            ans[i]=sum(nums);
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