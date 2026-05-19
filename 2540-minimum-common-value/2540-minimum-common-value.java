class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> h=new HashSet<>();
        for(int x:nums1){
            h.add(x);
        }
        for(int x:nums2){
            if(h.contains(x)){
                return x;
            }
        }
        return -1;
    }
}