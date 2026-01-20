class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++){
            int xx=nums.get(i);
            for(int x=1;x<=xx;x++){
                if((x|x+1)==xx){
                    ans[i]=x;
                    break;
                }
            }
        }
        return ans;
    }
}