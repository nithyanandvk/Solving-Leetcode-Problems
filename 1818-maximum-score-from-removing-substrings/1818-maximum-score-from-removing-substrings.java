class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st = new Stack<>();
        boolean check = x > y;
        int ans = 0;
        if (check) {
            for (char c : s.toCharArray()) {
                if (st.isEmpty()) {
                    st.push(c);
                } else {
                    if (c == 'b' && st.peek() == 'a') {
                        st.pop();
                        ans = ans + x;
                    } else {
                        st.push(c);
                    }
                }
            }
            StringBuilder sb=new StringBuilder();
            while(!st.isEmpty()){
                sb.append(st.pop());
            }
            for (char c : sb.toString().toCharArray()) {
                if (st.isEmpty()) {
                    st.push(c);
                } else {
                    if (c == 'b' && st.peek() == 'a') {
                        st.pop();
                        ans = ans + y;
                    } else {
                        st.push(c);
                    }
                }
            }
        } else {
            for (char c : s.toCharArray()) {
                if (st.isEmpty()) {
                    st.push(c);
                } else {
                    if (c == 'a' && st.peek() == 'b') {
                        st.pop();
                        ans = ans + y;
                    } else {
                        st.push(c);
                    }
                }
            }
            StringBuilder sb=new StringBuilder();
            while(!st.isEmpty()){
                sb.append(st.pop());
            }
            for (char c : sb.toString().toCharArray()) {
                if (st.isEmpty()) {
                    st.push(c);
                } else {
                    if (c == 'a' && st.peek() == 'b') {
                        st.pop();
                        ans = ans + x;
                    } else {
                        st.push(c);
                    }
                }
            }
        }
        return ans;
    }
}