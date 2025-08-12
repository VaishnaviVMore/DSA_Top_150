class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
           hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
           if(hm.get(nums[i])==2){
                return nums[i];
    }
    }
    
    return -1;
    }
}