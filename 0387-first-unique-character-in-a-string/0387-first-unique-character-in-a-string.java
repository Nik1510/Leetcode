class Solution {
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        int[] freq = new int[26]; // To store frequencies of characters

        // Count frequencies of each character in the string
        for (char ch : c) {
            freq[ch - 'a']++;
        }

        // Find the first character with a frequency of 1
        for (int i = 0; i < c.length; i++) {
            if (freq[c[i] - 'a'] == 1) { // Use c[i] instead of ch[i]
                return i;
            }
        }

        return -1; // If no unique character is found
    }
}
