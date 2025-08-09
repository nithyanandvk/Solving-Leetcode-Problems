class Solution {
    public List<String> subdomainVisits(String[] d) {
        HashMap<String,Integer> h=new HashMap<>();
        for(String s:d){
            String a[]=s.split(" ");
            String b[]=a[1].split("\\.");
            int n=b.length;
            StringBuilder sb=new StringBuilder(b[n-1]);
            int x=Integer.parseInt(a[0]);
            h.put(sb.toString(), h.getOrDefault(sb.toString(), 0) + x);
            for(int i=n-2;i>=0;i--){
                sb.insert(0,b[i]+".");
                h.put(sb.toString(),h.getOrDefault(sb.toString(),0)+x);
            }
        }
        List<String> ans=new ArrayList<>();
        for(String s:h.keySet()){
            ans.add(h.get(s)+" "+s);
        }
        return ans;
    }
}