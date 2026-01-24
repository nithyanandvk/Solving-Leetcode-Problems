class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int ans[]=new int[n];
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                l.add(i);
            }
        }
        for(int i=0;i<n;i++){
            int min=n;
            for(int j=0;j<l.size();j++){
                int diff=Math.abs(l.get(j)-i);
                if(diff<min){
                    min=diff;
                }
            }
            ans[i]=min;
        }
        return ans;
    }
}