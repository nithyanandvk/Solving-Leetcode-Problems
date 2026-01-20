class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++){
            for(int x=1;x<=nums.get(i);x++){
                if((x|x+1)==nums.get(i)){
                    ans[i]=x;
                    break;
                }
            }
        }
        return ans;
    }
}