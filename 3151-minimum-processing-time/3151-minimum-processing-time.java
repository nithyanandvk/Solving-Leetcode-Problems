class Solution {
    public int minProcessingTime(List<Integer> p, List<Integer> t) {
        int n=p.size();
        Collections.sort(p);
        Collections.sort(t,Collections.reverseOrder());
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int x=p.get(i);
            max=Math.max(max,x+t.get(i*4));    
        }
        return max;
    }
}