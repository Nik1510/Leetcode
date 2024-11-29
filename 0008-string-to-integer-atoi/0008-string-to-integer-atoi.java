class Solution {
    public int myAtoi(String s) {
        s = s.trim(); // Remove leading and trailing whitespace
        if (s.length() == 0) return 0; // Return 0 for empty strings

        int index = 0, sign = 1;
        long result = 0;

        // Check for the sign
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // Process numeric characters
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');

            // Check for overflow
            if (result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            index++;
        }

        return (int) result * sign;
    }
}
