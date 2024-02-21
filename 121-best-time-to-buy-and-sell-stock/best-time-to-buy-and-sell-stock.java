class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int mem = 0;
        int buy = Integer.MAX_VALUE;
        int sell = Integer.MIN_VALUE;
        
        int indexOne = 0;
        int indexTwo =0;
        while (indexOne < prices.length) {
            while (indexTwo < prices.length) {
                if (indexOne != prices.length) {
                    if (buy > prices[indexTwo]) {
                        buy = prices[indexTwo];
                        sell = Integer.MIN_VALUE;
                    }
                    if (sell < prices[indexTwo]) {
                        sell = prices[indexTwo];
                    }
                    mem = sell - buy;
                    if (mem > sum) {
                        sum = mem;
                    }
                }
                indexTwo ++;
            }
            indexOne ++;
        }
        return sum;
    }
}