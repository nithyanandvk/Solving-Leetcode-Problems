class Solution {
    public int findMaxK(int[] nums) {
       ArrayList<Integer> p=new ArrayList<>();
       HashSet<Integer> h=new HashSet<>();
       for(int x:nums){
        if(x<0){
            h.add(x);
        }else{
            p.add(x);
        }
       }
       Collections.sort(p);
       for(int i=p.size()-1;i>=0;i--){
        int x=p.get(i);
        if(h.contains(x*-1)){
            return x;
        }
       } 
       return -1;
    }
}