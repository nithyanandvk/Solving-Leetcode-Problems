class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> h=new HashMap<>();
        for(String s:strs){
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String x=new String(arr);
            // if(!h.containsKey(x)){
            //     h.put(x,new ArrayList<>());
            // }
            h.putIfAbsent(x,new ArrayList<>());
            h.get(x).add(s);
        }
        return new ArrayList<>(h.values());
    }
}