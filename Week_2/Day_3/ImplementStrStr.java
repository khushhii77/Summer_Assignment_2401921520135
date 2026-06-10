// Problem: Find the first occurrence of needle in haystack.
// Approach: here we check every possible starting position and compare characters one by one.
// Time Complexity: O((n-m+1) * m)
// Space Complexity: O(1)

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (needle.length() > haystack.length()) return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;

            while (j < needle.length() &&
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) return i;
        }

        return -1;
    }
}
