class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        ArrayList<Integer>list=new ArrayList<>();
        int n=grid.length;
        int[] ans=new int[2];
        int cs=0;
        int sq=n*n;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(list.contains(grid[i][j])){
                    ans[0]=grid[i][j];
                }
                else{
                    list.add(grid[i][j]);
                    cs+=grid[i][j];
                }
            }
        }
        int ts=sq*(sq+1)/2;
        ans[1]=ts-cs;
    return ans;
    }
}