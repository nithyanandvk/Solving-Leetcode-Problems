class Solution {
    class Info{
        int p;
        int t;
        Info(int p,int t){
            this.p=p;
            this.t=t;
        }
        double gain(){
            return (double)(p+1)/(t+1)-(double)p/t;
        }
    }
    PriorityQueue<Info> pq=new PriorityQueue<>((a,b)->Double.compare(b.gain(), a.gain()));
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        for(int c[]:classes){
            pq.offer(new Info(c[0],c[1]));
        }
        for(int i=0;i<extraStudents;i++){
            Info best=pq.poll();
            best.p=best.p+1;
            best.t=best.t+1;
            pq.offer(best);
        }
        double sum = 0.0;
        for (Info c : pq) {
            sum += (double)c.p / c.t;
        }

        return sum / classes.length;
    }
}