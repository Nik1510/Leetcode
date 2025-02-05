class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.contains(s2)){
            return true;
        }
        char[] c = s1.toCharArray();
        char[] h = s2.toCharArray();
        int first = -1;
        int second=-1;
        for(int i =0; i<c.length;i++){
            if(c[i]!=h[i]){
                if(first==-1){
                    first =i;
                }
                else if(second ==-1){
                    second =i;
                }else{
                    return false;
                }
            }
        }

        return (second!=-1 && s1.charAt(first)==s2.charAt(second) && s1.charAt(second) == s2.charAt(first));
        
    }
}