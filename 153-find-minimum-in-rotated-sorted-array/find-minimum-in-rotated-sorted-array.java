class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int si=0;
        int ei=n-1;
        if(nums[si]<=nums[ei]){
            return nums[si];
        }
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid]>nums[si]){
                si=mid+1;
            }
            else{
                ei=mid-1;
            }
        }
        return -1;
    }
}