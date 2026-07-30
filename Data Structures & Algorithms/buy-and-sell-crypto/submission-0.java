class Solution {
    public int maxProfit(int[] prices) {
        int minimumPrice = prices[0];
        int maximumProfit = 0;

        for (int i = 0; i < prices.length; i++) 
        {
            int currentPrice = prices[i];

            if (currentPrice < minimumPrice) {
                minimumPrice = currentPrice;
            }
            else {
                int profitToday = currentPrice - minimumPrice;
                if (profitToday > maximumProfit) {
                    maximumProfit = profitToday;
                }
            }
        }

        return maximumProfit;
    }
}
