class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int si=0;
        int ei=n-1;
        while(si<ei){
            int mid=si+(ei-si)/2;
            if(mid%2==1){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                si=mid+2;
            }
            else{
                ei=mid;
            }
        }
        return nums[si];
    }
}