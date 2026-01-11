class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans=new ArrayList<String>();
        ArrayList<int[]> freq=new ArrayList<>();
        for(String x:words){
            int arr[]=new int[26];
            for(char c:x.toCharArray()){
                arr[c-'a']++;
            }
            freq.add(arr);
        }
        for(int i=0;i<26;i++){
            int c=100000;
            for(int j=0;j<words.length;j++){
                if(freq.get(j)[i]<c){
                    c=freq.get(j)[i];
                }
            }
            while(c>0){
                ans.add((char)('a'+i)+"");
                c--;
            }
        }
        return ans;
    }
}