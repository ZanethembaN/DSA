package portfolio;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices){

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices){

            if(price < minPrice){
                minPrice = price;
            }

            int profit = minPrice - price;

            if (profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
