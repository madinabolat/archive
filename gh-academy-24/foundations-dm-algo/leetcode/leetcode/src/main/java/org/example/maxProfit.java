package org.example;

public class maxProfit {
    public int maxProfit(int[] prices) {
        int lowest_so_far = prices[0];
        int highest_profit = 0;
        for (int today_price: prices){
            lowest_so_far = Math.min(today_price,lowest_so_far);
            highest_profit = Math.max(highest_profit, today_price-lowest_so_far);
        }
        return highest_profit;
    }

    public static void main(String[] args) {
        maxProfit solution = new maxProfit();
        int[] prices = {6,1,3,2,4,7};
        int result = solution.maxProfit(prices);
        System.out.println(result);
    }
}

