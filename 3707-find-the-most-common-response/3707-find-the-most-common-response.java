class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String, Integer> h = new HashMap<>();
        int max = 0;
        for (List<String> li : responses) {
            HashSet<String> hh = new HashSet<>(li);
            for (String s : hh) {
                int n = h.getOrDefault(s, 0) + 1;
                h.put(s, n);
                if (n > max) {
                    max = n;
                }
            }
        }
        ArrayList<String> ans=new ArrayList<>();
        for (String s : h.keySet()) {
            if (h.get(s) == max) {
                ans.add(s);
            }
        }
        Collections.sort(ans);
        return ans.get(0);

    }
}