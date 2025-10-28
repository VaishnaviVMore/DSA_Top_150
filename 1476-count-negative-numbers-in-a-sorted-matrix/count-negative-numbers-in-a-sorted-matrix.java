class Solution {
    public int countNegatives(int[][] grid) {
        int trow=grid.length;
        int tcol=grid[0].length;
        int row=0;int col=tcol-1;int count=0;
        while(col>=0 && trow>row){
            if(grid[row][col]<0 ){
                col--;
                count+=trow-row;
            }
            else{
                row++;
            }
        }
        return count;
    }
}