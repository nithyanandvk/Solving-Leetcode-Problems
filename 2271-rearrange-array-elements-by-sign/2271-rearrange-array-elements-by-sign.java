class Solution {
    public int[] rearrangeArray(int[] nums) {
        // ArrayList<Integer> n=new ArrayList<>();
        // ArrayList<Integer> p=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<0){
        //         n.add(nums[i]);
        //     }else{
        //         p.add(nums[i]);
        //     }
        // }
        // for(int i=0;i<nums.length/2;i++){
        //     nums[2*i]=p.get(i);
        //     nums[2*i+1]=n.get(i);
        // }
        // return nums;

        int p=0;
        int n=1;
        int x=nums.length;
        int ans[]=new int[x];
        for(int i=0;i<x;i++){
            if(nums[i]>0){
                ans[p]=nums[i];
                p=p+2;
            }else{
                ans[n]=nums[i];
                n=n+2;
            }
        }
        return ans;
    }
}