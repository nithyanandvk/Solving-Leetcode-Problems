class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,ArrayList<Integer>> h=new HashMap<>();
        for(int i=1;i<=n;i++){
            int s=0;
            int x=i;
            while(x>0){
                s=s+x%10;
                x=x/10;
            }
            h.putIfAbsent(s,new ArrayList<>());
            h.get(s).add(x);
        }
        int max=0;
        for(int x:h.keySet()){
            max=Math.max(max,h.get(x).size());
        }
        int ans=0;
        for(int x:h.keySet()){
            if(h.get(x).size()==max){
                ans++;
            }
        }
        return ans;
    }
}