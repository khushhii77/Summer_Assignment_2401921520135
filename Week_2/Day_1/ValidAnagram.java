/*
Problem: Valid Anagram

Approach: We Use a HashMap to store frequency of characters in string s.
- Increase count for each character in s & Decrease count for each character in t.
- If all frequencies become 0, both strings are anagrams.

Time Complexity: O(n)
Space Complexity: O(k)
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp = new HashMap<>();

        for(char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }

        for(char ch : t.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch,0)-1);
        }

        for(int x : mp.values()) {
            if(x != 0) return false;
        }

        return true;
    }
}
