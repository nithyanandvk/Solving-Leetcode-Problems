class Solution {
    public boolean isIsomorphic(String s, String t) {
        int i=0;
        int n=s.length();
        HashMap<Character,Character> h=new HashMap<>();
        boolean arr[]=new boolean[256];
        while(i<n){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(h.containsKey(a)){
                if(h.get(a)!=b){
                    return false;
                }
            }else{
                if(arr[b]){
                    return false;
                }
                h.put(a,b);
                arr[b]=true;
            }
            i++;
        }
        return true;
    }
}