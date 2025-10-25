class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int n=nums.length;
        //int i=0;
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(hm.get(nums[i])==1){
            return nums[i];
        }
    }
        return -1;
    }
}