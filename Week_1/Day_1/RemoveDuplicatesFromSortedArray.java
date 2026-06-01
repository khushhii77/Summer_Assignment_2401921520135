// Problem: Remove Duplicates from Sorted Array
// Description: Remove duplicate elements from sorted array in-place.
// Approach: we Use two pointers and keep unique elements at front.
// Time Complexity: O(n)

class Solution {
    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int k = 1;
        for(int i = 1; i < nums.length; i++){

            if(nums[i] != nums[i - 1]){
                nums[k] = nums[i];
                k++;
            }
          
        }

        return k;
    }
}
