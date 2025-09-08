class Solution {
    public int dfs(int n,int[] f){
        if(n==1 || n==2 ||n==3){
            return n;
        }
        if(f[n]!=0){
            return f[n];
        }
        f[n]=dfs(n-1,f)+dfs(n-2,f);
        return f[n];
    }
    public int climbStairs(int n) {
        int[] f=new int[n+1];
        return dfs(n,f);
        
    }
}