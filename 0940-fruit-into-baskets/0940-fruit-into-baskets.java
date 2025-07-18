class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int r=0;
        int n=fruits.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        int max=0;
        while(r<n){
            if(h.size()<2  || h.containsKey(fruits[r])){
                h.put(fruits[r],h.getOrDefault(fruits[r],0)+1);
                r++;
            }else{
                max=Math.max(r-l,max);
                int x=h.get(fruits[l]);
                if(x==1){
                    h.remove(fruits[l]);
                }else{
                    h.put(fruits[l],x-1);
                }
                l++;
            }
        }
        max=Math.max(r-l,max);
        return max;
    }
}