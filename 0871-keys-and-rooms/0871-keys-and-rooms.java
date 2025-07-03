class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> h=new HashSet<>();
        q.add(0);
        h.add(0);
        while(!q.isEmpty()){
            int k=q.poll();
            for(int i:rooms.get(k)){
                if(!h.contains(i)){
                    q.add(i);
                    h.add(i);
                }                
            }
        }
        for(int i=0;i<n;i++){
            if(!h.contains(i)){
                return false;
            }
        }
        return true;
    }
}