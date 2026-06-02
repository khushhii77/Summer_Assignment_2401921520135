// Problem: Contains Duplicate
// Description: Check whether any element appears more than once.
// Approach: we Store elements in HashSet and detect duplicates.
// Time Complexity: O(n)
//Spce com: O(n)

import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {

            if (set.contains(x))
                return true;

            set.add(x);
        }

        return false;
    }
}
