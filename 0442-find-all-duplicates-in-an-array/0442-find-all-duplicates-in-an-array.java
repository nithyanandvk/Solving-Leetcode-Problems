class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n+1];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
            if(arr[nums[i]]==2){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}