class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int[] result={-1,-1};
        for(int i=0;i<n;i++){
            int rem=target-nums[i];
            if(hm.containsKey(rem)){
                result[0]=i;
                result[1]=hm.get(rem);
            }
            hm.put(nums[i],i);
        }
        return result;
    }
}