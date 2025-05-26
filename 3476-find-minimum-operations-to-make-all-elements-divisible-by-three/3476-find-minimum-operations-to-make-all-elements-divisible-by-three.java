class Solution {
    public int minimumOperations(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int r=nums[i]%3;
            if(r==1 || r==2){
                sum=sum+1;
            }
        }
        return sum;
    }
}