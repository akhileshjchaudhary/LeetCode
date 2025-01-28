import java.util.HashMap;

class Solution {
    public int myAtoi(String s) {
        s = s.trim(); // Remove leading and trailing whitespaces
        if (s.isEmpty()) return 0; // Handle empty strings

        // Create a HashMap to map digits as characters to their integer values
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

        // Handle signs
        if (s.charAt(0) == '-') {
            isNegative = true;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        // Convert characters to numbers
        for (; i < s.length(); i++) {
            char c = s.charAt(i);

            // Check if the character is a digit using the HashMap
            if (!map.containsKey(c)) break;

            int digit = map.get(c);

            // Check for overflow/underflow
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                if (isNegative) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            }

            res = res * 10 + digit;
        }

        // Apply the sign
        if (isNegative) {
            res = -res;
        }

        return res;
    }
}
