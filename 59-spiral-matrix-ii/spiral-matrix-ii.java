class Solution {
    public int[][] generateMatrix(int n) {
        int startrow=0;
        int startcol=0;
        int endcol=n-1;
        int endrow=n-1;
        //ArrayList<Integer> List=new ArrayList<>();
        int[][] grid=new int[n][n];
        int val=1;
        //for(int i=startcol;i)
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int i=startcol;i<=endcol;i++){
                grid[startrow][i]=val++;
            }
            //left
            for(int j=startrow+1;j<=endrow;j++){
                grid[j][endcol]=val++;
            }
            if(startrow<endrow && startcol<endcol){
                for(int i=endcol-1;i>=startcol;i--) grid[endrow][i]=val++;
                for(int j=endrow-1;j>=startrow+1;j--) grid[j][startrow]=val++;
            }
            startrow++;endrow--;startcol++;endcol--;
        }
        return grid;
    }
}