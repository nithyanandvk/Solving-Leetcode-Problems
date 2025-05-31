class Solution {
    public int numberOfBeams(String[] bank) {
        int arr[]=new int[bank.length];
        for(int i=0;i<bank.length;i++){
            int c=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    c++;
                }
            }
            arr[i]=c;
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 ){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]!=0){
                        sum=sum+arr[i]*arr[j];
                        break;
                    }
                }
            }
        }
        return sum;
    }
}