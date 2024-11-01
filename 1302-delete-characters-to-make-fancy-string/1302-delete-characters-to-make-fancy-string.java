class Solution {
    public String makeFancyString(String s) {
        StringBuilder st = new StringBuilder();
        for(int i =0; i<s.length();i++){
            if(st.length()<2 || !(st.charAt(st.length()-1)==s.charAt(i) && st.charAt(st.length()-2)==s.charAt(i) )){
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }
}