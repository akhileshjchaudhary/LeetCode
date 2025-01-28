import java.util.HashMap;

class Solution {
    public int myAtoi(String s) {
        s = s.trim(); // Step 1: Remove leading whitespace

        if (s.isEmpty()) {
            return 0; // Handle empty string
        }

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('0', 0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);

        int res = 0;
        boolean isNegative = false;
        int i = 0;

        // Step 2: Handle the sign
        if (s.charAt(0) == '-') {
            isNegative = true;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        // Step 3: Process characters and build the number
        for (; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!map.containsKey(c)) {
                break; // Stop on encountering a non-digit character
            }

            int digit = map.get(c);

            // Step 4: Check for overflow
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            res = res * 10 + digit;
        }

        // Step 5: Apply the sign
        if (isNegative) {
            res = -res;
        }

        return res;
    }
}
