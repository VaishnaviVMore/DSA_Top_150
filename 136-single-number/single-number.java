class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>Hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Hm.put(nums[i],Hm.getOrDefault(nums[i],0)+1);
        }
        for(int j=0;j<nums.length;j++){
        if(Hm.get(nums[j])!=2){
            return nums[j];
        }
        }
        return -1;
    }
}