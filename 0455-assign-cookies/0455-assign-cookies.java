class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // s[j] >=g[i]
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0;
        int i =0; 
        int j=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                c++;
                i++;
                j++;
            }else{
                j++;
            }
      
        }
        return c;
    }
}