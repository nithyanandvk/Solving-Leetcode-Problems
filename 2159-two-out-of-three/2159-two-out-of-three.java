class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> a = new HashSet<>();
        for (int x : nums1) {
            a.add(x);
        }
        HashSet<Integer> b = new HashSet<>();
        for (int x : nums2) {
            b.add(x);
        }
        HashSet<Integer> c = new HashSet<>();
        for (int x : nums3) {
            c.add(x);
        }
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int x:a){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(int x:b){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(int x:c){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(int x:h.keySet()){
            if(h.get(x)>=2){
                l.add(x);
            }
        }
        return l;
    }
}