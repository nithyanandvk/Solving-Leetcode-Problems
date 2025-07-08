class Solution {
    public int[] findOrder(int n, int[][] pre) {
        int in[] = new int[n];
        for (int i = 0; i < pre.length; i++) {
            in[pre[i][0]]++;
        }

        int ans[] = new int[n];
        int x = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0) q.add(i);
        }

        while (!q.isEmpty()) {
            int curr = q.poll();
            ans[x++] = curr;
            for (int i = 0; i < pre.length; i++) {
                if (pre[i][1] == curr) {
                    in[pre[i][0]]--;
                    if (in[pre[i][0]] == 0) {
                        q.add(pre[i][0]);
                    }
                }
            }
        }

        return x == n ? ans : new int[0];
    }
}
