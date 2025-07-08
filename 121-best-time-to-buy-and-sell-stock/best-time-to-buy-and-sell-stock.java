class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Lowest price so far
        int maxProfit = 0;                // Maximum profit so far

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // update the buying price
            } else if (prices[i] - minPrice > maxProfit) {// if recent price subtracted by min price is still   
                                                    //greater than the max price then put that value in max  
                                                    //price and that will be the max profit
                maxProfit = prices[i] - minPrice; // update profit
            }
        }

        return maxProfit;
    }
}
