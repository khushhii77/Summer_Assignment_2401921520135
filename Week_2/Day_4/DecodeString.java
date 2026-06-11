// Problem:Decode the encoded string following the k[encoded_string] pattern.
// Approach: Use recursion to process nested brackets and repeat substrings.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    int idx = 0;

    public String decodeString(String s) {
        return solve(s);
    }

    private String solve(String s) {
        String ans = "";
        int num = 0;

        while (idx < s.length()) {
            char ch = s.charAt(idx);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                idx++;

                String part = solve(s);

                for (int i = 0; i < num; i++) {
                    ans += part;
                }

                num = 0;
            }

            else if (ch == ']') {
                return ans;
            }

            else {
                ans += ch;
            }

            idx++;
        }

        return ans;
    }
}
