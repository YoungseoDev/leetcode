class Solution {
    public int maxProfit(int[] prices) {
        int num = 0;
        for(int i = 1; i < prices.length ; i++){
            int value = prices[i] - prices[i-1];
            if(value <=0)
            {
                continue;
            }
            else
            {
                num += value;
            }
        }

        return num;
    }
}