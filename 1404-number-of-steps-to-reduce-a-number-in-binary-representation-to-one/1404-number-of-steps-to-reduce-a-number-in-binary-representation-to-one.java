class Solution {
    public int numSteps(String s) {
        //Long x=Long.parseLong(s,2);
        int ans = 0;
        // while(x!=1){
        //     if(x%2==0){
        //         x=x/2;
        //     }else{
        //         x++;
        //     }
        //     ans++;
        // }
        int n = s.length();
        int carry = 0;
        for (int i = n - 1; i > 0; i--) {
            char c = s.charAt(i);
            if (c == '0') {
                if (carry == 1) {
                    ans += 2;
                } else {
                    ans += 1;
                }
            } else {
                if (carry == 1) {
                    ans += 1;
                } else {
                    ans += 2;
                    carry = 1;
                }
            }
        }
        return ans + carry;
    }
}