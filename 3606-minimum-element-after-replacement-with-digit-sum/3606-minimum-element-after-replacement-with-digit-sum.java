class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,sum(nums[i]));
        }
        return min;
    }
    public int sum(int n){
        int s=0;
        while(n>0){
            int r=n%10;
            s=s+r;
            n=n/10;
        }
        return s;
    }
}