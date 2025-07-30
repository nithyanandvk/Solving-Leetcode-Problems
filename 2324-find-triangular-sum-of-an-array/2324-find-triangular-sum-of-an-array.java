class Solution {
    public int triangularSum(int[] nums) {
        int i=nums.length;
        while(i!=1){
            i--;
            int arr[]=new int[i];
            for(int j=0;j<i;j++){
                arr[j]=(nums[j]+nums[j+1])%10;
                nums[j]=arr[j];
            }
        }
        return nums[0];
    }
}