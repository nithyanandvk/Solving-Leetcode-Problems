class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");
        int n=arr.length;
        String ans[]=new String[n];
        for(int i=0;i<n;i++){
            ans[arr[i].charAt(arr[i].length()-1)-'1']=arr[i].substring(0,arr[i].length()-1);
        }
        return String.join(" ",ans);
    }
}