class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
       Set<Integer>st=new HashSet<>();
       int i=0;
       int j=0;
       long sum=0;
       long result=0;
       while(j<n){
        while(st.contains(nums[j])){
            st.remove(nums[i]);
            sum-=nums[i];
            i++;
        }
        sum+=nums[j];
        st.add(nums[j]);
        if(j-i+1==k){
            result=Math.max(result,sum);
            st.remove(nums[i]);
            sum-=nums[i];
            i++;
        }
        j++;
       }
       return result;
    }
}