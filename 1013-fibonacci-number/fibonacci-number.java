class Solution {
    public int helper(int n,int f[]){
        if(n==0 || n==1){
        return n;
    }
    if(f[n]!=0){
        return f[n];
    }
    f[n]=fib(n-1)+fib(n-2);
    return f[n];
    }
    public int fib(int n) {
    int[] f=new int[n+1];
    return helper(n,f);
}
}