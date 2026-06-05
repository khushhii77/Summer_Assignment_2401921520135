// Topic: String Basics
// Problem: Reverse String
// Description:
// Reverse the given character array in-place.
// Approach: Use two pointers and swap characters from both ends.
// Time Complexity: O(n)
//Space com: O(1)

class Solution {
    public void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;

        while (i < j) {

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
}
