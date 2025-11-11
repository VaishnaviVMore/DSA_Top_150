class Solution {
    public static int jump(int[] height,int n, int dp[]){
        //base case
        //int n=height.length;
        if(n==0 || n==1){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int first=jump(height, n-1, dp)+height[n-1];
        //int second=Integer.MAX_VALUE;
        int second=jump(height, n-2,dp)+height[n-2];
        dp[n]=Math.min(first, second);
        return dp[n];
        }

    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        return jump(cost,n,dp);
    }
}