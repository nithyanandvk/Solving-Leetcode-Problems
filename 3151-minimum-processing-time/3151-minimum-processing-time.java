class Solution {
    public int minProcessingTime(List<Integer> p, List<Integer> t) {
        int n=p.size();
        Collections.sort(p);
        Collections.sort(t,Collections.reverseOrder());
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int x=p.get(i);
            for(int j=i*4;j<i*4+4;j++){
                max=Math.max(max,x+t.get(j));
            }
        }
        return max;
    }
}