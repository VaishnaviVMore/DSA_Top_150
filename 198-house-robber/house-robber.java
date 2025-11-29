class Solution {
    public int helper(int[] nums,int dp[]){
        // if(ind==0) return nums[0];
        // if(ind<0) return 0;
        dp[0]=nums[0];

    for(int i=1;i<nums.length;i++){
        int pick=nums[i];
        if(i>1) pick+=dp[i-2];
        int nopick=0+dp[i-1];
        dp[i]=Math.max(pick,nopick);
    }
        // int pick=nums[ind];
        // if(ind>1) pick+=helper(nums,ind-2);
        // int nonPick=0+helper(nums,ind-1);
        return dp[nums.length-1];
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,dp);
    }
}