class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int val = 0;
        for(int i =1;i <prices.length;i++){
            if(prices[i]-min>val)val = prices[i]-min;
            if(prices[i]<min) min = prices[i];
        }
        return val;
    }
}