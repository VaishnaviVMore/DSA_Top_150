class Solution {
    public int helper(int ind, int T, int[] coins, int dp[][]){
        if(ind==0){
            if(T% coins[0]==0) return T/coins[0];
                return (int)1e9;
        }
            if(dp[ind][T] != -1) return dp[ind][T];

            //not take
            int no=0+helper(ind-1,T,coins,dp);
            // take
            int yes =(int)1e9;
            if(coins[ind]<=T){
                yes=1+helper(ind, T-coins[ind], coins, dp);
            }
            return dp[ind][T]=Math.min(yes, no);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
         for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
         }
         int ans=helper(n-1, amount, coins, dp);
         if(ans>=(int) 1e9) return -1;
         return ans;
    }
}