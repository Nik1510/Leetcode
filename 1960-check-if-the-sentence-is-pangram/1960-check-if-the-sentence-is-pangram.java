class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean [] a = new boolean [26];
        for(int i =0; i<sentence.length();i++){
            int c = sentence.charAt(i);
            if(c>='a' && c<='z'){
                a[c-'a']=true;
            }
        }
        for(int i=0; i<a.length;i++){
            if(a[i]==false){
                return false;
            }
        }
        return true;
    }
}