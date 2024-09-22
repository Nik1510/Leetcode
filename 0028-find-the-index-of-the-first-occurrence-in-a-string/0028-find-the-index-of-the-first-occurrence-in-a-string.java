class Solution {
    public int strStr(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if (n == 0) {
            return 0; // If s2 is empty, return 0
        }

        for (int i = 0; i <= (m - n); i++) {
            for (int j = 0; j < n; j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
                if (j == n - 1) {
                    return i; // Match found, return index
                }
            }
        }
        return -1; // No match found
    }
}
