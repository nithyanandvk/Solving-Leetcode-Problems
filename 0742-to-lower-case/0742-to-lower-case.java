class Solution {
    public String toLowerCase(String s) {
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            char c=arr[i];
            if(c>='A' && c<='Z'){
                arr[i]=(char)(c+32);
            }
        }
        return new String(arr);
    }
}