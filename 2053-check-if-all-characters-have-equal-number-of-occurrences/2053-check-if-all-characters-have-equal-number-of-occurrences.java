class Solution {
    public boolean areOccurrencesEqual(String s) {
        int arr[]=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        int c=0;
        for(int i=0;i<26;i++){
          if(arr[i]!=0){
            c=arr[i];
            break;
          }  
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                continue;
            }
            if(arr[i]!=c){
                return false;
            }
        }
        return true;
    }
}