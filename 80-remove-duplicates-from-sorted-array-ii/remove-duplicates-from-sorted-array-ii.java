class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int m=nums[i];
            if(j<2 || nums[j-2]!=m){
                nums[j++]=m;
            }
        }
        return j;
    }
}