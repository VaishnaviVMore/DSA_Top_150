class Solution {
    public static int helper(int[] nums, int ind, int end,int dp[]){
        if(ind>end)return 0;
        //if(ind<0) return 0;
        if(dp[ind] != -1) return dp[ind];
        int take=nums[ind]+helper(nums,ind+2,end,dp);;
        int notake=0+helper(nums, ind+1, end ,dp);
        dp[ind]=Math.max(take, notake);
        return dp[ind];

    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int[] dp1=new int[n];
        Arrays.fill(dp1,-1);
        int c1=helper(nums,0,n-2,dp);
        int c2=helper(nums,1,n-1,dp1);
        return Math.max(c1,c2);
    }
}