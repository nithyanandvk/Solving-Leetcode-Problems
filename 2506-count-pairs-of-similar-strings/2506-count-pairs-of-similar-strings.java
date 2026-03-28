class Solution {
    public int similarPairs(String[] words) {
        int n=words.length;
        ArrayList<HashSet<Character>> al=new ArrayList<>();
        for(String x:words){
            HashSet<Character> h=new HashSet<>();
            for(char c:x.toCharArray()){
                h.add(c);
            }
            al.add(h);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(al.get(i).size()==al.get(j).size()){
                    boolean check=true;
                    for(char x:al.get(i)){
                        if(!al.get(j).contains(x)){
                            check=false;
                            break;
                        }
                    }
                    if(check){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}