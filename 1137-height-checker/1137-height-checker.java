class Solution {
    public int heightChecker(int[] heights) {
        int[]  x = Arrays.copyOf(heights,heights.length);
        int c=0;
        Arrays.sort(heights);
        for(int i=0;i<x.length;i++){
            if(x[i]!=heights[i]){
                c++;
            }
        }
        return c;
    }
}