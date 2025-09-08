class Solution {
    private static int MOD = 1000000007;
    public long pow(long base, long ex) {
        if (ex == 0) return 1;
        long halfpow = pow(base, ex / 2) % MOD;
        long result = (halfpow * halfpow) % MOD;
        if (ex % 2 == 1) {
            result = (result * base) % MOD;
        }
        return result;
    }

    public int countGoodNumbers(long n) {
        long odd = n / 2;
        long even = n / 2 + n % 2;

        long a = pow(5, even);
        long b = pow(4, odd);

        return (int)((a * b) % MOD);
    }
}
