class Solution {
    public String[] findWords(String[] words) {
        // Define the rows as strings
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        // List to store the valid words
        List<String> result = new ArrayList<>();
        
        // Helper function to check if the word can be typed using one row
        for (String word : words) {
            if (canBeTypedWithOneRow(word.toLowerCase(), row1) ||
                canBeTypedWithOneRow(word.toLowerCase(), row2) ||
                canBeTypedWithOneRow(word.toLowerCase(), row3)) {
                result.add(word);
            }
        }
        
        // Convert the list to an array and return
        return result.toArray(new String[0]);
    }
    
    // Function to check if the word can be typed using only one row
    private boolean canBeTypedWithOneRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
