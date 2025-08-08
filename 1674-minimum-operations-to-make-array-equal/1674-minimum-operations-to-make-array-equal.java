class Solution {
    public int minOperations(int n) {
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=2*i+1;
        }
        int target=0;
        if((n%2)!=0){
            target=arr[n/2];
        }else{
            target=(arr[n/2]+arr[(n/2)-1])/2;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.abs(target-arr[i]);
        }
        return sum/2;
    }
}