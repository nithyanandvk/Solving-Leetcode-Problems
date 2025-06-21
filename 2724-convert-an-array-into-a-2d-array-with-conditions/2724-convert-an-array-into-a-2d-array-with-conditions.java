class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
            max=Math.max(max,h.get(nums[i]));
        }
        for (int i = 0; i < max; i++) {
            l.add(new ArrayList<Integer>());
        }
        for(int k:h.keySet()){
            if(h.get(k)==1){
                l.get(0).add(k);
            }else{
                int c=h.get(k);
                for(int i=0;i<c;i++){
                    l.get(i).add(k);
                }
            }
        }
        return l;
    }
}