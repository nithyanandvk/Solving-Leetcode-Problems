class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int x:nums){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        int ans=0;
        for(int x:h.keySet()){
            if(h.get(x)%k==0){
                ans=ans+x*h.get(x);
            }
        }
        return ans;
    }
}