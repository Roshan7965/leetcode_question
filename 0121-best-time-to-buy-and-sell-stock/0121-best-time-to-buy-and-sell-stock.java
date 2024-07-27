class Solution {
    public int maxProfit(int[] prices) {
        int maxPro=0;
        int minPrices=Integer.MAX_VALUE;
        for(int num:prices){
            minPrices=Math.min(num,minPrices);
            maxPro=Math.max(maxPro,num-minPrices);
        }
        return maxPro;
    }
}