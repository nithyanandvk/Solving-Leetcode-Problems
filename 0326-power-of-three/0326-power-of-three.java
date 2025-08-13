public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        // while (n % 3 == 0) {
        //     n = n / 3;
        // }
        // if (n == 1) {
        //     return true;
        // } else {
        //     return false;
        // }
        if(n==3 || n==1){
            return true;
        }
        if(n%3==0){
            return isPowerOfThree(n/3);
        }else{
            return false;
        }        
    }
}
