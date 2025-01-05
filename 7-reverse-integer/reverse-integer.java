class Solution {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            // Check for overflow before actually adding the digit
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow condition for positive numbers
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Overflow condition for negative numbers
            }

            ans = ans * 10 + digit;
        }
        return ans;
    }
}

