package org.example.solution.s0100.s0121BestTimetoBuyandSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        int[] profits = new int[prices.length];
        int minPrice;
        profits[0] = 0;
        minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            profits[i] = Math.max(0, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        int maxProfit = 0;
        for (int profit : profits) {
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
