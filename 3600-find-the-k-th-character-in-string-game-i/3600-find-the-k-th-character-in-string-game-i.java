class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder("a");
        while(sb.length()<=k){
            int n=sb.length();
            int i=0;
            while(i<n){
                char c=sb.charAt(i);
                sb.append((char)(c+1));
                i++;
            }
        }
        return sb.charAt(k-1);
    }
}