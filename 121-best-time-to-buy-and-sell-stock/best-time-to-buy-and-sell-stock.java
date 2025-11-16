class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0; int buyed_price = prices[0];
        for(int i=1; i<prices.length; i++){
            int current_price = prices[i];
            int profit = current_price - buyed_price;
            max_profit = Math.max(profit, max_profit);
            if(buyed_price>current_price){
                buyed_price = current_price;
            }
        }
        return max_profit;
    }
}