class Solution {
    public boolean squareIsWhite(String c) {
        int x=(c.charAt(0)-'a')+(c.charAt(1)-'0')+1;
        if(x%2==0){
            return false;
        }
        return true;
    }
}