// Problem: Maximum Average Subarray I
// Description: Find maximum average of any subarray of size k.
// Approach: we used a fixed-size sliding window to calculate each window sum in O(1) time .
// Time Complexity: O(n)
//Space com: O(1)

class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double sum = 0;
        for (int i = 0; i < k; i++)
            sum += nums[i];

        double maxSum = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k;
    }
}
