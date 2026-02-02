class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character, Integer> idx = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!idx.containsKey(ch)) {
                idx.put(ch, i);
            } else if (i - idx.get(ch) - 1 != distance[ch - 'a']) {
                return false;
            }
        }
        return true;
    }
}
