class Solution {
    public int maxProfit(int[] prices) {
        int lowestL = prices[0];

        int max = 0;

        for(int i=0; i<prices.length; i++){
            max = Math.max(max, prices[i]-lowestL);
            lowestL = Math.min(lowestL, prices[i]);
        }

        return max;
    }
}
