class Solution {
    public static int mod=1000000007;
    public long pow(long base, long ex){
        if(ex==0)return 1;
       long halfpow=pow(base,ex/2);
       if(ex%2==0){
        return (halfpow*halfpow)%mod;
       }
        return (halfpow*halfpow*base)%mod;
    }
    public int countGoodNumbers(long n) {
        long odd=n/2;
        long even=n/2+n%2;
       long a=pow(5,even);
       long b=pow(4,odd);
       return (int)((a*b)%mod);
    }
}