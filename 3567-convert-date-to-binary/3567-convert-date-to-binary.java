class Solution {
    public String convertDateToBinary(String date) {
        int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int d=Integer.parseInt(date.substring(8));
        return Integer.toBinaryString(year) + "-" +Integer.toBinaryString(month) + "-" +Integer.toBinaryString(d);    }
}