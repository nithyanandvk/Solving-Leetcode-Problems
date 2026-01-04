class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        int c = 2;
        int csum = 0;
        for (int x : nums) {
            c = 2;
            int xx = (int) Math.sqrt(x);
            if (xx * xx == x) {
                c--;
            }
            csum = 1 + x;
            for (int i = 2; i <= xx; i++) {
                if (x % i == 0) {
                    c=c+2;
                    csum=csum+i+(x/i);
                }
                if(c>4){
                    break;
                }
            }
            if(c==4){
                sum=sum+csum;
            }
        }
        return sum;
    }
}