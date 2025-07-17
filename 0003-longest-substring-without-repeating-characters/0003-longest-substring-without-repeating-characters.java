class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int l=0;
        int r=0;
        int n=s.length();
        HashSet<Character> h=new HashSet<>();
        while(r<n){
            char c=s.charAt(r);
            if(!h.contains(c)){
                h.add(c);
                max=Math.max(max,r-l+1);
                r++;                
            }else{
                h.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}