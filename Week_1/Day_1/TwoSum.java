// Problem: Two Sum
// Description: we will Find two indices such that nums[i] + nums[j] = target.
// Approach: we Store visited numbers in HashMap and check complement.
// Time Complexity: O(n)

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> mp = new HashMap<>();
      
        for(int i = 0; i < nums.length; i++){
            int k = target - nums[i];

            if(mp.containsKey(k))
                return new int[]{ mp.get(k), i };

            mp.put(nums[i], i);
        }

        return new int[0];
    }
}
