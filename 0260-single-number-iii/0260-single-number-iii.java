class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int x:nums){
            xor=xor^x;
        }
        int a=0;
        int b=0;
        int c=xor & (-xor);
        for(int x:nums){
            if((x & c) == 0){
                a=a^x;
            }else{
                b=b^x;
            }
        }
        return new int[]{a,b};
    }
}