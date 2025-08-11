class Solution {
    class Pair{
        char c;
        int f;
        Pair(char c,int f){
            this.c=c;
            this.f=f;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(char c:s.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        ArrayList<Pair> l=new ArrayList<>();
        for(char c:h.keySet()){
            l.add(new Pair(c,h.get(c)));
        }
        Collections.sort(l,(a,b)->b.f-a.f);
        StringBuilder ans=new StringBuilder();
        for(Pair p:l){
            for(int i=0;i<p.f;i++){
                ans.append(p.c);
            }
        }
        return ans.toString();
    }
}