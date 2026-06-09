// Problem: Find all starting indices of anagrams of p in s.
// Approach: Use Sliding Window and frequency array to track character matches.
// Time Complexity: O(n)
// Space Complexity: O(26)

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(s.length() < p.length()) return ans;

        int[] mp = new int[26];
        for(char c : p.toCharArray())
            mp[c - 'a']++;

        int l = 0, r = 0, cnt = p.length();

        while(r < s.length()) {
            if(mp[s.charAt(r) - 'a']-- > 0)
                cnt--;

            r++;

            if(cnt == 0) ans.add(l);

            if(r - l == p.length()) {
                if(mp[s.charAt(l) - 'a']++ >= 0)
                    cnt++;

                l++;
            }
        }

        return ans;
    }
}
