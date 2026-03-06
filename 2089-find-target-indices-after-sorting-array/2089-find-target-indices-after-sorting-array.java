class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                l.add(i);
            }
            if(nums[i]>target){
                break;
            }
        }
        return l;
    }
}