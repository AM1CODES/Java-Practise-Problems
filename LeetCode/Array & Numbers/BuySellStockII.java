class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]<prices[i]){
                profit += (prices[i]-prices[i-1]);
            }
        }
        return profit;
    }
}

/*
Just keep checking the numbers and keep taking the difference and adding them.
*/