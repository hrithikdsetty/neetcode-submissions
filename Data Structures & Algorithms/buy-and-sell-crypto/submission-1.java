class Solution {
    public int maxProfit(int[] prices) {
        int lowest = prices[0];
        int maxProf = 0;

        for(int i=0; i<prices.length; i++){
            maxProf = Math.max(maxProf, prices[i]-lowest);
            lowest = Math.min(lowest, prices[i]);
        }

        return maxProf;
    }
}
