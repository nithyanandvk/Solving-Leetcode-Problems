class Solution {
    static int ans;
    static int mod=1000000007;
    static int[][] memo;
    public int numWays(int s, int r) {
        ans=0;
        r=Math.min(r,s);
        memo = new int[s+1][r+1];
        for (int row[] : memo){
            Arrays.fill(row, -1);
        }
        ans=rec(s,r,0);
        return ans;
    }
    public static int rec(int s,int r,int curr){
        if(curr<0 || curr>=r){
            return 0;
        }
        if(s==0){
            if(curr==0){
               return 1; 
            }
            return 0;
        }
        if(memo[s][curr]!=-1){
            return memo[s][curr];
        }
        long a=rec(s-1,r,curr+1);
        long b=rec(s-1,r,curr-1);
        long c=rec(s-1,r,curr);
        memo[s][curr]=(int)((a + b + c) % mod);
        return memo[s][curr];
    }
}