// Problem: Longest Common Prefix
// Description: Find the longest common prefix among all strings in the array.
// Approach: Start with the first string as prefix and keep shrinking it until all strings match.
// Time Complexity: O(n * m)
//Space com: O(1)

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty())
                    return "";
            }
          
        }

        return prefix;
    }
}
