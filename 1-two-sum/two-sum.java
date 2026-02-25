class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<n;i++){
            int rem=target-nums[i];
            if(hm.containsKey(rem)){
                res[0]=i;
                res[1]=hm.get(rem);
            }
            hm.put(nums[i],i);
        }
        return res;
    }
}