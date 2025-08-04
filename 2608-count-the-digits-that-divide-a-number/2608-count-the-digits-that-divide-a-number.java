class Solution {
    public int countDigits(int num) {
        int c=0;
        int n=num;
        while(n>0){
            int r=n%10;
            if(num%r==0){
                c++;
            }
            n=n/10;
        }
        return c;
    }
}