class Solution {
    public long minimumCost(String s) {
        long min =0;
        int n =s.length();
        for(int i=1; i<n;i++){
            if(s.charAt(i-1)!=s.charAt(i)){
                min+=Math.min(i,n-i);
            }
        }
        return min;
    }
}