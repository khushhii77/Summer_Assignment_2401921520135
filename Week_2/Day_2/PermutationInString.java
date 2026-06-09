// Problem:Check if any permutation of s1 exists as a substring in s2.
// Approach: here we use Sliding Window and frequency array to maintain character counts.
// Time Complexity: O(n)
// Space Complexity: O(26)

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;

        int[] f = new int[26];
        for(char ch : s1.toCharArray()) {
            f[ch - 'a']++;
        }

        int i = 0;
        int cnt = s1.length();

        for(int j = 0; j < s2.length(); j++) {
            if(f[s2.charAt(j) - 'a']-- > 0) {
                cnt--;
            }

            if(cnt == 0) return true;

            if(j - i + 1 == s1.length()) {

                if(f[s2.charAt(i) - 'a']++ >= 0) cnt++;

                i++;
            }
        }

        return false;
    }
}
