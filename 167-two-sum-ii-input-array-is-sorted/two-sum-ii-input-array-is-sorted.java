class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int left=0;int right=n-1;
        int[] result={-1,-1};
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                result[0]=left+1;result[1]=right+1;
                return result;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }
}