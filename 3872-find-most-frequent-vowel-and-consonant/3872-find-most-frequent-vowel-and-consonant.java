class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> hv=new HashMap<>();
        HashMap<Character,Integer> hc=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                hv.put(ch,hv.getOrDefault(ch,0)+1);
            }else{
                hc.put(ch,hc.getOrDefault(ch,0)+1);
            }           
        }
        int vc=0,cc=0;
        for(Map.Entry<Character,Integer> e:hv.entrySet()){
            vc=Math.max(vc,e.getValue());
        }
        for(Map.Entry<Character,Integer> e:hc.entrySet()){
            cc=Math.max(cc,e.getValue());
        }
        return vc+cc;
    }
}