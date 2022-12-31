class Solution {
    //Solution for https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
    //Apporach: If current price is greater than previous price then add the diff in profit.
    public int maxProfit(int[] prices) {
       int max_profit = 0;
         
       for (int i=1;i<prices.length;i++){
           if(prices[i]>prices[i-1]){
             max_profit = max_profit + (prices[i]-prices[i-1]);   
           }
       }
            
       return max_profit; 
    }
}