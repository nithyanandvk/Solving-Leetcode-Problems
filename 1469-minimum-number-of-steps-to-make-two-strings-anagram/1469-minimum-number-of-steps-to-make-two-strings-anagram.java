class Solution {
    public int minSteps(String s, String t) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
        }
        int pos=0,neg=0;
        for(int i=0;i<26;i++){
            if(arr[i]<0){
                neg+=arr[i];
            }
            else {
                pos+=arr[i];
            }
        }
        return Math.max(pos,Math.abs(neg));
    }
}