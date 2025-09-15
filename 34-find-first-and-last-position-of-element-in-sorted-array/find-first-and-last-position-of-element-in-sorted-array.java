class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] result={-1, -1};
        int left=0;int right=n-1;
        boolean found=false;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                result[0]=mid;
                right=mid-1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        left=0;right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                result[1]=mid;
                left=mid+1;
            }
            else if(target>nums[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
}
return result;
    }
    }