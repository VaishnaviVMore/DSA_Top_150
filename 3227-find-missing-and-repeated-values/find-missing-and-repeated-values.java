class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] result={-1,-1};
        int n=grid.length;
        int size=n*n;
        int[] freq=new int[size+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                freq[grid[i][j]]++;
            }
        }
    for(int i=1;i<=size;i++){
        if(freq[i]==2){
            result[0]=i;
        }
        else if(freq[i]==0){
            result[1]=i;
        }
    }
    return result;
    }
}