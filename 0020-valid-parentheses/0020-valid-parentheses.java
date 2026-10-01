import java.util.*;

class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '{') {
                st.push('}');
            }
            else if (s.charAt(i) == '(') {
                st.push(')');
            }
            else if (s.charAt(i) == '[') {
                st.push(']');
            }
            else {
                if (st.isEmpty()) {
                    return false;
                }

                if (s.charAt(i) != st.peek()) {
                    return false;
                }

                st.pop();
            }
        }

        return st.isEmpty();
    }
}