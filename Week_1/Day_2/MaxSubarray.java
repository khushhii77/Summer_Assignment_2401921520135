// Topic: Prefix Sum / Sliding Window
// Problem: Maximum Subarray
// Description: we Find the contiguous subarray having the largest sum.
// Approach: Use Kadane's Algorithm to maintain current sum maximum sum.
// Time Complexity: O(n)
//Space com: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
