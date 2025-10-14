class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] ls=new int[n];
        ls[0]=nums[0];
        for(int i=1;i<n;i++){
            ls[i]=ls[i-1]+nums[i];
        }
        int[] rs=new int[n];
        rs[n-1]=nums[n-1];
        for(int j=n-2;j>=0;j--){
            rs[j]=rs[j+1]+nums[j];
        }
        for(int i=0;i<n;i++){
            int leftSum = (i == 0) ? 0 : ls[i - 1];
            int rightSum = (i == n - 1) ? 0 : rs[i + 1];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}