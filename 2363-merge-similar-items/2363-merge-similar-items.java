class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2){
        List<List<Integer>> ans=new ArrayList<>();
        TreeMap<Integer,Integer> h=new TreeMap<>();
        for(int x[]:items1){
            h.put(x[0],x[1]);
        }
        for(int x[]:items2){
            h.put(x[0],h.getOrDefault(x[0],0)+x[1]);
        }
        for(int x:h.keySet()){
            List<Integer> l=new ArrayList<>();
            l.add(x);
            l.add(h.get(x));
            ans.add(l);
        }
        return ans;
    }
}