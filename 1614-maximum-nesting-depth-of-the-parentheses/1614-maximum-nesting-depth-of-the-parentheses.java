class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c++;
                ans=Math.max(ans,c);
            }else if(s.charAt(i)==')'){
                c--;
            }
        }
        return ans;
    }
}