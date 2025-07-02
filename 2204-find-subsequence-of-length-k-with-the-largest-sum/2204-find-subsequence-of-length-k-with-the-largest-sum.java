class Solution {
    static class point implements Comparable<point>{
        int data;
        int i;
        public point(int d,int i){
            this.data = d;
            this.i = i;
        }
        @Override
        public int compareTo(point a){
            return a.data - this.data;
        }
    }
    public int[] maxSubsequence(int[] nums, int k) {
        int arr[] = new int[k];
        ArrayList<point> li = new ArrayList<>();
        PriorityQueue<point> q = new PriorityQueue<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            q.add(new point(nums[i],i));
        }
        while(j<k){
            arr[j] = q.remove().i;
            j++;
        }
        Arrays.sort(arr);
        for(int i=0;i<k;i++){
            arr[i] = nums[arr[i]];
        }
        return arr;
    }
}