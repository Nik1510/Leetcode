class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        // String str="";
        int j=0;
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length;i++){
            if(j<spaces.length && spaces[j]==i){
                str.append(" ");
                // str+=" ";
                j++;
            }
            str.append(ch[i]);
            // str+=ch[i];
        }
        return str.toString();
        // return str;
    }
}