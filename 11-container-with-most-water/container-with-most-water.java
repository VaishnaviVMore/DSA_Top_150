class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int maxi=Integer.MIN_VALUE;
        while(left<right){
            int hei=Math.min(height[left],height[right]);
            int width=right-left;
            int area=hei*width;
            maxi=Math.max(maxi,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxi;
    }
}