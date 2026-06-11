// Problem: Generate all possible valid combinations of n pairs of parentheses.
// Approach: Use backtracking to add opening and closing brackets while maintaining validity.
// Time Complexity: O(4^n / √n)
// Space Complexity: O(n)

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve(res, "", 0, 0, n);
        return res;
    }

    void solve(List<String> res, String cur, int open, int close, int n) {
        if (cur.length() == 2 * n) {
            res.add(cur);
            return;
        }

        if (open < n)
            solve(res, cur + "(", open + 1, close, n);

        if (close < open)
            solve(res, cur + ")", open, close + 1, n);
    }
}
