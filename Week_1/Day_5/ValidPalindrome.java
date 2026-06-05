// Topic: String Basics
// Problem: Valid Palindrome
// Description:
// Check whether a string is a palindrome after removing non-alphanumeric characters.
// Approach: Use two pointers from both ends and compare characters case-insensitively.
// Time Complexity: O(n)
//Space co,: O(1)

class Solution {
    public boolean isPalindrome(String s) {

        int l = 0, r = s.length() - 1;

        while (l < r) {

            while (l < r && !Character.isLetterOrDigit(s.charAt(l)))
                l++;

            while (l < r && !Character.isLetterOrDigit(s.charAt(r)))
                r--;

            // Convert both characters to lowercase and compare
            if (Character.toLowerCase(s.charAt(l)) !=
                Character.toLowerCase(s.charAt(r)))
                return false;

            l++;
            r--;
        }

        return true;
    }
}
