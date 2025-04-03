class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int [2];
        HashMap<Integer,Integer>Hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remen=target-nums[i];
            if(Hm.containsKey(remen)){
                ans[0]=i;
                ans[1]=Hm.get(remen);
                
                
                return ans;
            }
            Hm.put(nums[i],i);
        }
        return new int[]{};
    }
}