class Solution {
    public int fib(int n) {
        if(n==0||n==1){
            return n;
        }
        int fnm1=1;
        int fnm2=0;
        int fn=0;
        for(int i=2;i<=n;i++){
            fn=fnm1+fnm2;
            fnm2=fnm1;
            fnm1=fn;
        }
        return fn;
    }
}