class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int m=nums[0];
        for(int i=1;i<n;i++){
            m=m^nums[i];
        }
        return m;
    }
}