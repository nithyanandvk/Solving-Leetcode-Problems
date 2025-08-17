class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> h = new HashMap<>();
        HashMap<String, Character> hh = new HashMap<>();
        String arr[] = s.split(" ");
        int i = 0;
        int n = pattern.length();
        if(n!=arr.length){
            return false;
        }
        while (i < n) {
            char a = pattern.charAt(i);
            String b = arr[i];
            if (h.containsKey(a)) {
                if (!h.get(a).equals(b)) {
                    return false;
                }
            }
            if (hh.containsKey(b)) {
                if (!hh.get(b).equals(a)) {
                    return false;
                }
            }
            h.put(a,b);
            hh.put(b,a);
            i++;
        }
        return true;
    }
}