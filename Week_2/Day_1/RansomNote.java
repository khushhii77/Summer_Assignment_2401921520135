// Problem: Ransom Note
// Description: Check if ransomNote can be formed using characters from magazine.
// Approach: we store magazine character frequencies in HashMap and reduce counts while traversing ransomNote.
// Time Complexity: O(m+n)
// Space Complexity: O(k)

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()) return false;

        HashMap<Character,Integer> mp = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            mp.put(ch, mp.getOrDefault(ch,0) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);

            if(!mp.containsKey(ch) || mp.get(ch) == 0)
                return false;

            mp.put(ch, mp.getOrDefault(ch,0) - 1);
        }

        return true;
    }
}
