class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[] = { -1, -1 };
        a[0]=bin(nums,target,true);
        a[1]=bin(nums,target,false);
        return a;
    }
    public static int bin(int nums[],int target,boolean check){
        int i=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target<nums[mid]){
                r=mid-1;
            }else if(target>nums[mid]){
                l=mid+1;
            }else{
                i=mid;
                if(check){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
        }
        return i;
    }
}