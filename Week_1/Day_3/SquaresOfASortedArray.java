// Problem: Squares of a Sorted Array
// Description: Return the squares of each number in sorted order.
// Approach: We compare squares from both ends and fill answer array from the back.
// Time Complexity: O(n)
//Space com: O(n)

class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int l = 0;
        int r = n - 1;
        int k = n - 1;

        while (l <= r) {
            int l_sq = nums[l] * nums[l];
            int r_sq = nums[r] * nums[r];

            if (l_sq > r_sq) {
                ans[k] = l_sq;
                l++;
            } else {
                ans[k] = r_sq;
                r--;
            }

            k--;
        }

        return ans;
    }
}
