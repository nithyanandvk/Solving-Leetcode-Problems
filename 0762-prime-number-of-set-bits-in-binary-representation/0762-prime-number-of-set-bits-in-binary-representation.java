class Solution {
    public int countPrimeSetBits(int l, int r) {
        int ans = 0;
        for (int i = l; i <= r; i++) {
            if (rec(i)) {
                ans++;
            }
        }
        return ans;
    }

    public boolean rec(int x){
        int i=0;
        while(x>0){
            int r=x&1;
            if(r==1){
                i++;
            }
            x=x>>1;
        }
        if(i==2 || i == 3 || i==5 || i==7 || i==11 || i==13 || i==17 || i==19){
            return true;
        }
        return false;
    }

}