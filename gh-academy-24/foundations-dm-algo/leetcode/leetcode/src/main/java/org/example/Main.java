package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int[] profits = new int[prices.length];
        for (int i = 0; i < prices.length-1; i++){
            int buy = prices[i];
            int sell = prices[i+1];
            for (int j = i+1; j < prices.length-i-1; j++){
                if (prices[j]>sell){
                    sell = prices[j];
                }
            }
            profits[i]=sell-buy;
        }
        int maxProfit = profits[0];
        for (int i = 0; i< profits.length; i++){
            if (maxProfit > profits[i]){
                maxProfit = profits[i];
            }
        }
        return(maxProfit);
    }
}