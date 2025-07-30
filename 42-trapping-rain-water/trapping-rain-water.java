class Solution {
    public int trap(int[] height) {
        int n=height.length;
        //leftmost
        int[] leftmost=new int[n];
        leftmost[0]=height[0];
        for(int i=1;i<n;i++){
            leftmost[i]=Math.max(height[i],leftmost[i-1]);
        }
        int[] rightmost=new int[n];
        rightmost[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmost[i]=Math.max(height[i],rightmost[i+1]);
        }
        int trappedwater=0;
        for(int j=0;j<n;j++){
            int waterlevel=Math.min(leftmost[j],rightmost[j]);
            trappedwater+=waterlevel-height[j];
        }
        return trappedwater;
    }
}