class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String s3 = s+s;
        return s3.contains(goal);
    }
}