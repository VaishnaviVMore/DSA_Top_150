class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int k=n-1;
        int[] ans=new int[n];
        while(left<=right){
            // if(nums[left]*nums[left]==nums[right]*nums[right]){
            //     ans[k]=nums[left]*nums[left];
            //     k--;
            //     left++;
            //     right--;
            // }
            if(nums[left]*nums[left]<nums[right]*nums[right]){
                ans[k]=nums[right]*nums[right];
                k--;
                right--;
            }
            else{
                ans[k]=nums[left]*nums[left];
                k--;
                left++;
            }
        }
        return ans;
    }
}