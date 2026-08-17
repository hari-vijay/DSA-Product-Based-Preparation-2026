/*
 * Problem: Best Time to Buy and Sell Stock
 * LeetCode: 121
 *
 * Approach:
 * Keep track of the minimum price seen so far.
 * For every current price, calculate the possible profit
 * and update the maximum profit.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int maxProfit(int[] prices) {

         int min_value = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++){
            min_value = Math.min(min_value, prices[i]);
            profit = Math.max(profit, prices[i] - min_value);
        }

        return profit;
    }
}
