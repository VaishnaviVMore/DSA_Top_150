class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>main=new ArrayList<>();
        int n=nums.length;
       for(int i=0;i<n;i++){
        if(i>0 && nums[i]==nums[i-1])continue;
            int k=i+1;
             int j=n-1;
            while(k<j){
                List<Integer>sub=new ArrayList<>();
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    sub.add(nums[i]);
                    sub.add(nums[j]);
                    sub.add(nums[k]);
                    main.add(sub);

                    while(j>k && nums[j]==nums[j-1]){
                    j--;
                }
                while(j>k && nums[k]==nums[k+1]){
                    k++;
                }
                j--;k++;
                }
                else if(sum>0){
                    j--;
                }
                else{
                    k++;
                }
            }
        }
        return main;
    }
}