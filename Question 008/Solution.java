class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] Array = new int[n][2];
        Array[0][0] = -prices[0];
        for (int i = 1; i < n; ++i) {
            Array[i][0] = Math.max(Array[i - 1][0], Array[i - 1][1] - prices[i]);
            Array[i][1] = Math.max(Array[i - 1][1], Array[i - 1][0] + prices[i]);
        }
        return Array[n - 1][1];
    }
}