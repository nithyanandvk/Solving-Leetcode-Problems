class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxIdx=0;
        for(int i=0;i<n;i++){
            if(i>maxIdx){
                return false;
            }
            if(i+nums[i]>maxIdx){
                maxIdx=i+nums[i];
            }
        }
        return true;
        // int i;
        // for(i=0;i<n;i++){
        //     int p=1;
        //     while(p<=nums[i]){
        //         if(i+p<n && nums[i+p]!=0){
        //             i=i+p;
        //             break;
        //         }else{
        //             p++;
        //         }
        //     }
        // }
        // if(i>=n){
        //     return true;
        // }else{
        //     return false;
        // }


    }
}