class Solution {
    public int matchPlayersAndTrainers(int[] p, int[] t) {
        int i =0;
        int j = 0;
        Arrays.sort(p);
        Arrays.sort(t);
        int c=0;
        while(i<p.length && j< t.length){
            if(p[i]<=t[j]){
                c++;
                i++;
            }
            
            j++;
        }
        return c;
    }
}