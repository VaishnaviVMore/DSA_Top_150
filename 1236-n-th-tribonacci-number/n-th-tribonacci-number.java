class Solution {
    public int tribonacci(int n) {
        if(n==0|| n==1)return n;
        if(n==2)return 1;
        int fnm3=0;
        int fnm2=1;
        int fnm1=1;
        int fn=0;
        for(int i=3;i<=n;i++){
            fn=fnm1+fnm2+fnm3;
            fnm3=fnm2;
            fnm2=fnm1;
            fnm1=fn;
            
        }
        return fn;
    }
}