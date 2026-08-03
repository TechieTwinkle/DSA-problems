// Last updated: 04/08/2026, 01:38:52
class Solution {
    public double myPow(double x, int n) {
        long N = n; // handle overflow (important!)
        
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        return power(x, N);
    }

    private double power(double x, long n) {
        // base case
        if (n == 0) return 1;

        // recursive call
        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half; // even
        } else {
            return x * half * half; // odd
        }
    } 
}