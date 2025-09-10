class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int maxi=Integer.MIN_VALUE;
        while(left<=right){
            int wid=right-left;
            int hei=Math.min(height[right],height[left]);
            int area=wid*hei;
             maxi=Math.max(maxi,area);
            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return maxi;
    }
}