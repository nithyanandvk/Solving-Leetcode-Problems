class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int c=0;
        while(s.contains("01")){
            s=s.replace("01","10");
            c++;
        }
        return c;
    }
}