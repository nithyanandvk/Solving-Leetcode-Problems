class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> h=new HashSet<>();
        int n=s.length();
        for(int i=0;i+k<=n;i++){
            h.add(s.substring(i,i+k));
        }
        if(h.size()==Math.pow(2,k)){
            return true;
        }
        return false;
    }
}