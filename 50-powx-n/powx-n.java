class Solution {
    public double myPow(double x, int n) {
        if(n==0)return 1.0;
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        };
        double half=myPow(x,(int)(N/2));
        if(N%2==0){
            return half*half;
        }
        else{
            return half*half*x;
        }
    }
}