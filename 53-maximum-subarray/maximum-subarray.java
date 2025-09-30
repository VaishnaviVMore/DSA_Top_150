class Solution {
    public int maxSubArray(int[] nums) {
        int currsum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            maxi=Math.max(currsum,maxi);
            if(currsum<0){
                currsum=0;
            }
        }
        return maxi;
    }
}