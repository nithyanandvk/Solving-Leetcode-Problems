class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[]=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
        }
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}