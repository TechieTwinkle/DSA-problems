// Last updated: 08/09/2026, 21:29:36
class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1) + fib(n-2);
    }
}