class Solution {
    public boolean canAliceWin(int[] nums) {
        int a=0;
        int b=0;
        for(int i:nums){
            if(i>=10){
                a=a+i;
            }else{
                b=b+i;
            }
        }
        return a!=b;
    }
}