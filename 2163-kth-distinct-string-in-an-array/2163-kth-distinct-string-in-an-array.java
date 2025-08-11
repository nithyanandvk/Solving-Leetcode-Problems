class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String,Integer> h=new LinkedHashMap<>();
        for(String s:arr){
            h.put(s,h.getOrDefault(s,0)+1);
        }
        int c=0;
        for(String x:h.keySet()){
            if(h.get(x)==1){
                c++;
            }
            if(c==k){
                return x;
            }
        }
        return "";
    }
}