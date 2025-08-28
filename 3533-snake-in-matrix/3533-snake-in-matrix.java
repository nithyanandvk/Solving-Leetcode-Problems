class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int ans=0;
        for(String c:commands){
            if(c.equals("UP")){
                ans=ans-n;
            }else if(c.equals("DOWN")){
                ans=ans+n;
            }else if(c.equals("LEFT")){
                ans--;
            }else{
                ans++;
            }
        }
        return ans;
    }
}