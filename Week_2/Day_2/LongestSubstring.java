// Problem: Longest Substring Without Repeating Characters
// Approach: We Use HashMap and Sliding Window to track last occurrence of characters.
// Time Complexity: O(n)
// Space Complexity: O(k)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        int i = 0, ans = 0;

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);

            if (mp.containsKey(ch)) {
                i = Math.max(i, mp.get(ch) + 1);
            }

            mp.put(ch, j);
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
