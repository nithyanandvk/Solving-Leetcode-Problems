class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> l=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            l.add(index[i],nums[i]);
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=l.get(i);
        }
        return ans;
    }
}