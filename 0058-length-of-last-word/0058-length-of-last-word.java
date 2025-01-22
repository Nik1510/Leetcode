class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int count =0;
        if(s.length()==1){
            return 1;
        }
        for(int i =s.length()-1;i>=0;i--){
            if((s.charAt(i))==' '){
                break;
            }
            count++;
        }
        return count;
    }
}