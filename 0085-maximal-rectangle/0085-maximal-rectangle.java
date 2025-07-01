class Solution {
    public int maximalRectangle(char[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int m[][]=new int[r][c];
        for(int i=0;i<c;i++){
            if(matrix[0][i]=='1'){
                m[0][i]=1;
            }else{
                m[0][i]=0;
            }
        }
        for(int i=1;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]=='1'){
                    m[i][j]=1+m[i-1][j];
                }else{
                    m[i][j]=0;
                }
            }
        }
        int max=0;
        for(int i=0;i<r;i++){
            //System.out.println(Arrays.toString(m[i]));
            int curr=histo(m[i]);
            if(curr>max){
                max=curr;
            }
        }
        return max;
    }
    public static int histo(int arr[]){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int nsr[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsr[i]=n;
            }else{
                nsr[i]=st.peek();
            }
            st.push(i);
        }

        st=new Stack<>();
        int nsl[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=st.peek();
            }
            st.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++){
            int curr=nsr[i]-nsl[i]-1;
            if(curr*arr[i]>max){
                max=curr*arr[i];
            }
        }
        return max;
    }
}