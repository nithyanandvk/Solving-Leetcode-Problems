class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        int st=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(h.containsKey(c)){                
                st = Math.max(st, h.get(c) + 1);                
            }
            h.put(c,i);
            max=Math.max(max,i-st+1);
        }
        return max;
    }
}