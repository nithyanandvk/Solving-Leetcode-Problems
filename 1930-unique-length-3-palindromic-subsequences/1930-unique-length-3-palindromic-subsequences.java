class Solution {
    public int countPalindromicSubsequence(String s) {
        int f[]=new int[26];
        int l[]=new int[26];
        Arrays.fill(f,-1);
        Arrays.fill(l,-1);
        int i=0;
        for(char c:s.toCharArray()){
            if(f[c-'a']==-1){
                f[c-'a']=i;
                l[c-'a']=i;
            }
            if(f[c-'a']!=-1){
                l[c-'a']=i;
            }
            i++;
        }
        int ans=0;
        HashSet<Character> h;
        for(i=0;i<26;i++){
            h=new HashSet<>();
            if(f[i]!=-1){
                for(int j=f[i]+1;j<l[i];j++){
                    h.add(s.charAt(j));
                }
            }
            ans=ans+h.size();
        }
        return ans;
    }
}