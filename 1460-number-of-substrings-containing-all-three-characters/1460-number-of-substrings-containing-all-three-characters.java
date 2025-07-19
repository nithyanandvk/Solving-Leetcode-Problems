class Solution {
    public int numberOfSubstrings(String s) {
        // int n=s.length();
        // int c=0;
        // for(int i=0;i<n;i++){
        //     StringBuilder sb=new StringBuilder();
        //     for(int j=i;j<n;j++){
        //         sb.append(s.charAt(j));
        //         if(sb.indexOf("a")!=-1 && sb.indexOf("b")!=-1  && sb.indexOf("c")!=-1 ){
        //             c++;
        //         }
        //     }
        // }
        // return c;

        // int n = s.length();
        // int c = 0;
        // for (int i = 0; i < n; i++) {
        //     int arr[]=new int[3];
        //     for (int j = i; j < n; j++) {
        //         arr[s.charAt(j)-'a']=1;
        //         if (arr[0]+arr[1]+arr[2]==3) {
        //             c++;
        //         }
        //     }
        // }
        // return c;


        int n = s.length();
        int c = 0;
        int r=0;
        int arr[]=new int[3];
        Arrays.fill(arr,-1);
        while(r<n){
            arr[s.charAt(r)-'a']=r;
            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1){
                int min=Math.min(arr[0],Math.min(arr[1],arr[2]));
                c=c+min+1;
            }
            r++;
        }
        return c;
    }
}