class Solution {
    static int ans=0;
    public int countVowelStrings(int n) {
        ans=0;
        rec(n,0);
        return ans;
    }
    public static void rec(int n,int i){
        if(n==0){
            ans++;
            return;
        }
        for(int x=i;x<5;x++){
            rec(n-1,x);
        }
    }
}