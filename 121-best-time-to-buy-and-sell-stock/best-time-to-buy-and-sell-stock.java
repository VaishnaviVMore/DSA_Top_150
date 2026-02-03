class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice=prices[0];
        int maxprofit=Integer.MIN_VALUE;
        int n=prices.length;
        for(int i=0;i<n;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxprofit=Math.max(profit,maxprofit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxprofit>0 ? maxprofit :0;
    }
}