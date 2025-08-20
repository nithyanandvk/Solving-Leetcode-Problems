class Solution {
    int arr[];
    int brr[];
    int max;
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        arr=new int[26];
        max=Integer.MIN_VALUE;
        brr=score;
        for(int i=0;i<letters.length;i++){
            arr[letters[i]-'a']++;
        }
        rec(words,0,words.length,new StringBuilder());
        return max;
    }
    public void rec(String words[],int i,int n,StringBuilder sb){
        if(i==n){
            int freq[]=new int[26];
            int ans=0;
            for(int x=0;x<26;x++){
                freq[x]=arr[x];
            }
            for(int x:sb.toString().toCharArray()){
                freq[x-'a']--;
                if(freq[x-'a']<0){
                    return;
                }
                ans=ans+brr[x-'a'];
            }
            max=Math.max(max,ans);
            return;
        }
        sb.append(words[i]);
        rec(words,i+1,n,sb);
        sb.delete(sb.length()-words[i].length(),sb.length());
        rec(words,i+1,n,sb);
    }
}