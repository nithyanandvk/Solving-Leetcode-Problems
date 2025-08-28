class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c = 0, z = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                c++;
            } else {
                z++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c-1;i++){
            sb.append("1");
        }
        for(int i=0;i<z;i++){
            sb.append("0");
        }
        sb.append("1");
        return sb.toString();
    }
}