class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Iterate through each word
        for (int i = 0; i < words.length; i++) {
            // Check if the word starts with the searchWord
            if (words[i].startsWith(searchWord)) {
                return i + 1; // Return 1-indexed position
            }
        }
        
        // If no prefix match is found, return -1
        return -1;
    }
}
