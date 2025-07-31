class Solution {
    public int countNegatives(int[][] grid) {
        int Trow=grid.length;
        int Tcol=grid[0].length;
        int row=0;int col=Tcol-1; int count=0;
        while(Trow>row && col>=0){
            if(grid[row][col]<0){
                // col--;
                count+=Trow-row;
                col--;
            }
            else{
                row++;
            }
        }
        return count;
    }
}