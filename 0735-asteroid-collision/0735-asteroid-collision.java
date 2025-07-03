class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st = new Stack<>();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean alive = true;
            while (!st.isEmpty() && st.peek() > 0 && a[i] < 0) {
                int top = st.peek();
                if (top < -a[i]) {
                    st.pop();
                } else if (top == -a[i]) {
                    st.pop();
                    alive = false;
                    break;
                } else {
                    alive = false;
                    break;
                }
            }
            if (alive) {
                st.push(a[i]);
            }
        }
        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}
