class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length()-2;
        HashSet<Character> h=new HashSet<>();
        int c=0;
        for(int i=0;i<n;i++){
            h=new HashSet();
            for(int j=i;j<i+3;j++){
                h.add(s.charAt(j));
            }
            if(h.size()==3){
                c++;
            }
        }
        return c;
    }
}