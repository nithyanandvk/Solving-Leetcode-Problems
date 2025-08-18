class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int a[]=new int[2];       
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target && i!=j){                    
        //             a[0]=i;
        //             a[1]=j;                    
        //         }
        //     }
        // }
        // Arrays.sort(nums);
        // int left=0,right=nums.length-1;
        // while(left<right){
        //     if(nums[left]+nums[right]==target){
        //         a[0]=left;
        //         a[1]=right;
        //         return a;
        //     }else if(nums[left]+nums[right]>target){
        //         right--;
        //     }else{
        //         left++;
        //     }
        // }
        int n=nums.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            int c=target-nums[i];
            if(h.containsKey(c)){
                return new int[]{h.get(c),i};
            }
            h.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}