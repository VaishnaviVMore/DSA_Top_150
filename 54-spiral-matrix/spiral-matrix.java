class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        ArrayList<Integer>list=new ArrayList<>();
        int srow=0,erow=n-1,scol=0,ecol=m-1;
        while(srow<=erow && scol<=ecol){
            //up
             for(int i=scol;i<=ecol;i++){
                list.add(matrix[srow][i]);
            }
            //right
            for(int j=srow+1;j<=erow;j++){
                list.add(matrix[j][ecol]);
            }
            //down
            for(int k=ecol-1;k>=scol;k--){
                if(srow==erow)break;
                list.add(matrix[erow][k]);
            }
            //left
            for(int l=erow-1;l>=srow+1;l--){
                if(scol==ecol)break;
                list.add(matrix[l][srow]);
            }
            srow++;scol++;erow--;ecol--;
        }
        return list;
    }
}