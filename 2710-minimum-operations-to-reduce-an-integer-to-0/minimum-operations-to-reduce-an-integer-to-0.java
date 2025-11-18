class Solution {
    public int minOperations(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n,dp);
    }
    public static int solve(int n, int dp[]){
        if(n==0 ||n==1){
            return n;
        }
        if(dp[n]!=-1)return dp[n];

        int val=1;
        while(val*2<n){
            val=val*2;
        }
        int add=solve(val*2-n,dp);
        int sub=solve(n-val,dp);
        dp[n]=1+Math.min(add,sub);
        return dp[n];
    }
}