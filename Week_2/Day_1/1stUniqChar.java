/*
Problem: First Unique Character in a String

Approach:
- SHERE, WE store frequency of each character using HashMap.
- Traverse the string again and return the index of the first character whose frequency is 1.

Time Complexity: O(n)
Space Complexity: O(k)
*/

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++) {
            if(mp.get(s.charAt(i)) == 1)  return i;
        }
          
        return -1;
    }
}
