class Solution {
    public int numberOfSpecialChars(String word) {
        int arr[]=new int[52];
        for(char x:word.toCharArray()){
            if(x>='a'){
                arr[x-'a']=1;
            }else{
                arr[x-'A'+26]=1;
            }
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(arr[i]!=0 && arr[i+26]!=0){
                c++;
            }
        }

        return c;
    }
}