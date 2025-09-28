class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int a[]=new int[4];
        int b[]=new int[4];
        int c[]=new int[4];
        int cc=3;
        while(num1>0){
            a[cc--]=num1%10;
            num1=num1/10;
        }
        cc=3;
        while(num2>0){
            b[cc--]=num2%10;
            num2=num2/10;
        }
        cc=3;
        while(num3>0){
            c[cc--]=num3%10;
            num3=num3/10;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<4;i++){
            ans.append(Math.min(a[i],Math.min(b[i],c[i])));
        }
        return Integer.parseInt(ans.toString());
    }
}