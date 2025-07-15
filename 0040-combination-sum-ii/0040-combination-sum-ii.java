class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        Arrays.sort(c);
        ans = new ArrayList<>();
        backtrack(c, t, 0, new ArrayList<>());
        return ans;
    }
    private void backtrack(int[] c, int target, int start, List<Integer> path) {
        if (target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < c.length; i++) {
            if (i > start && c[i] == c[i - 1]) {
                continue;
            }
            if (c[i] > target) {
                break;
            }
            path.add(c[i]);
            backtrack(c, target - c[i], i + 1, path);
            path.remove(path.size() - 1);
        }
    }
}
