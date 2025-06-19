class Solution {
    public int minimumBuckets(String hamsters) {
        if (hamsters.equals("H") || hamsters.equals("HH")) {
            return -1;
        } else if (hamsters.contains("HHH") || hamsters.startsWith("HH") || hamsters.endsWith("HH")) {
            return -1;
        }
        return hamsters.replace("H.H","  ").length()-hamsters.replace("H","").length();
    }
}