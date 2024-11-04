class Solution {
    public String compressedString(String w) {
        StringBuilder st = new StringBuilder();
        int i =0;
        while (i < w.length()) {
            char currentChar = w.charAt(i);
            int count = 0;

            while (i < w.length() && w.charAt(i) == currentChar) {
                if(count==9){
                    st.append(count);
                   st.append(currentChar);
                   count=0;
                }
                count++;
                i++;
            }
                    st.append(count);
                   st.append(currentChar);
        }

        return st.toString();
    }
}