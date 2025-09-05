class Solution {
    public int reverse(int x) {
        long r =0;
        while(x != 0){
        int d = x%10;
        r = r*10+d;
        x = x/10;
        }
         return (r> Integer.MAX_VALUE||r < Integer.MIN_VALUE)?0:(int)r;
    }
   
}