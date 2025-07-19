class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        ArrayList<String> l=new ArrayList<>();
        int n=folder.length;
        String prev="";
        for(int i=0;i<n;i++){
            if(l.isEmpty()){
                l.add(folder[i]);
                prev=folder[i];
            }else{
                if(!folder[i].startsWith(prev+"/")){
                    l.add(folder[i]);
                    prev=folder[i];
                }
            }
        }
        return l;
    }
}