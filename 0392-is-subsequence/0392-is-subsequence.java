class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length(),m=t.length();
        int l=0,r=0;
        while(l<n && r<m){
            if(s.charAt(l)==t.charAt(r)){
                l++;
                r++;
            }else{
                r++;
            }
        }
        return l==n;
    }
}