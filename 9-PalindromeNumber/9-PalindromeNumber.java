// Last updated: 04/08/2026, 01:39:16
class Solution {
    public boolean isPalindrome(int x) {
        
        // Negative numbers can't be palindrome
        if (x < 0) return false;

        int original = x;
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;

            // Check overflow (important for safety)
            if (rev > Integer.MAX_VALUE / 10) return false;

            rev = rev * 10 + digit;
            x = x / 10;
        }

        return rev == original;
    }
}
