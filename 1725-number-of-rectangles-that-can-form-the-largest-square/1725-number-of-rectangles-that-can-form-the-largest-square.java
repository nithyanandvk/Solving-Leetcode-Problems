class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int x[]:rectangles){
            int s=Math.min(x[0],x[1]);
            h.put(s,h.getOrDefault(s,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(int x:h.keySet()){
            if(max<x){
                max=x;
            }
        }
        return h.get(max);
    }
}