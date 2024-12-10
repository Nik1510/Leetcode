class Solution {
    public String convertToTitle(int c) {
        StringBuilder str = new StringBuilder();
        while(c!=0){
            c--;
            str.append((char)(c%26+'A'));
            c/=26;
        }
        return str.reverse().toString();
    }
}