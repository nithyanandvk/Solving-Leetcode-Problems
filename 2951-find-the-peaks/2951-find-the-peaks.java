class Solution {
    public List<Integer> findPeaks(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<nums.length-1;i++){
            if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]){
                l.add(i);
            }
        }
        return l;
    }
}