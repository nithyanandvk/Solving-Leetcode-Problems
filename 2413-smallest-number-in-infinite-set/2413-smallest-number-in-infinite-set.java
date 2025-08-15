class SmallestInfiniteSet {
    HashSet<Integer> h=new HashSet<>();
    PriorityQueue<Integer> q=new PriorityQueue();
    int x;
    public SmallestInfiniteSet() {
        h=new HashSet<>();
        q=new PriorityQueue<>();
        x=1;
    }
    
    public int popSmallest() {
        if(!q.isEmpty()){
            int y=q.poll();
            h.remove(y);
            return y;
        }
        return x++;
    }
    
    public void addBack(int num) {
        if(num<x && !h.contains(num)){
            q.add(num);
            h.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */