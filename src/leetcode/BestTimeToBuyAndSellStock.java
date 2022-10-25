package leetcode;

public class BestTimeToBuyAndSellStock {
    public int maxProfit0(int[] prices) {
        int min = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (min>prices[i]) min = prices[i];
            if (res<prices[i] - min) res = prices[i] - min;
        }
        return res;
    }
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int max_profit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                max_profit = Math.max(max_profit, profit);
            } else {
                left = right;
            }
            right++;
        }
        return max_profit;
    }
}
