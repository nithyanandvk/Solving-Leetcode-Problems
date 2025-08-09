class Solution {
    class Pair{
        int f;
        char c;
        Pair(int f,char c){
            this.f=f;
            this.c=c;
        }
    }
    public int minimumPushes(String word) {
        int arr[]=new int[26];
        for(char c:word.toCharArray()){
            arr[c-'a']++;
        }
        ArrayList<Pair> l=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                l.add(new Pair(arr[i],(char)('a'+i)));
            }
        }
        Collections.sort(l,(a,b)->b.f-a.f);
        HashMap<Character,Integer> h=new HashMap<>();
        int c=0;
        for(Pair p:l){
            if(c<8){
                h.put(p.c,1);
            }else if(c<16){
                h.put(p.c,2);
            }else if(c<24){
                h.put(p.c,3);
            }else{
                h.put(p.c,4);
            }
            c++;
        }
        int ans=0;
        for(char x:word.toCharArray()){
            ans=ans+h.get(x);
        }
        return ans;
    }
}