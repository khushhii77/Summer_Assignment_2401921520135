// Problem: Check whether the given brackets are valid.
// Approach: we will use a stack to match opening and closing brackets.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {

                if (st.isEmpty()) return false;

                char ch2 = st.peek();

                if ((ch2 == '(' && ch == ')') ||
                    (ch2 == '{' && ch == '}') ||
                    (ch2 == '[' && ch == ']'))
                    st.pop();

                else
                    return false;
            }
        }

        return st.isEmpty();
    }
}
