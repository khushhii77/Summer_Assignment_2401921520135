// Problem: Best Time to Buy and Sell Stock
// Description: Find maximum profit by buying once and selling once.
// Approach: we will track minimum price so far and update profit.
// Time Complexity: O(n)

class Solution {
    public static int maxProfit(int[] prices) {

        int min = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, prices[i] - min);
            min = Math.min(min, prices[i]);
        }

        return profit;
    }
}
