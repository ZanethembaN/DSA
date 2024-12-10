package portfolio;

public class BestTimeToBuyAndSellStock {

    /**
     * This class provides a solution for the "Best Time to Buy and Sell Stock" problem.
     * It calculates the maximum profit that can be achieved by making a single buy and
     * sell transaction given the stock prices over time.
     */
    public int maxProfit(int[] prices){

        /**
         * Finds the maximum profit that can be achieved from buying and selling the stock
         * at the most optimal time.
         *
         * @param prices An array of integers representing stock prices over time.
         *               Each element represents the price of the stock on a specific day.
         * @return The maximum profit that can be achieved by buying and then selling the stock.
         *         Returns 0 if no profit can be made.
         */

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Iterate through the array to determine the maximum profit.
        for (int price : prices){

            if(price < minPrice){
                minPrice = price;
            }

            // Calculate profit if selling at the current price.
            int profit = minPrice - price;

            // Update the maximum profit if the current profit is better.
            if (profit > maxProfit){
                maxProfit = profit;
            }
        }

        // Return the maximum profit found.
        return maxProfit;
    }
}
