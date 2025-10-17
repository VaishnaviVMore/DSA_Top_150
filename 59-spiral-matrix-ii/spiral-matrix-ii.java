class Solution {
    public int[][] generateMatrix(int n) {

       int[][] arr=new int[n][n];
       int srow=0;
       int erow=n-1;
       int scol=0;
       int ecol=n-1; int val=1;
       while(srow<=erow && scol<=ecol){
        for(int i=scol;i<=ecol;i++) arr[srow][i]=val++;
        for(int j=srow+1;j<=erow;j++) arr[j][erow]=val++;
        if(srow<erow && scol<ecol){
            for(int k=ecol-1;k>=scol;k--) arr[erow][k]=val++;
            for(int l=erow-1;l>=srow+1;l--) arr[l][scol]=val++;
        }
        srow++;erow--;scol++;ecol--;
       }
       return arr;
    }
}