class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int si=0;
        int ei=n-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(nums[mid]==target){
                return mid;
            }
            //l1
            if(nums[si]<=nums[mid]){
                //left
                if(target<=nums[mid] && nums[si]<=target){
                     ei=mid-1;
                }
                //right
                else{
                    si=mid+1;
                }
            }

            //l2
            else{
                //right
                if(target<=nums[ei] && nums[mid]<=target){
                    si=mid+1;
                }
                //left
                else{
                    ei=mid-1;
                }
            }
        }
        return -1;
    }
}