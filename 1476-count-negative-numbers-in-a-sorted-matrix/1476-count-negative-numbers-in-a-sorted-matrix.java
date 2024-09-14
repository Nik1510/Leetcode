class Solution {
    public int countNegatives(int[][] g) {
     int count =0; 
     for(int i=0; i<g.length;i++){
        for(int j=0; j<g[i].length;j++){
            if(g[i][j]<0){
                count++;
            }
        }
     }
     return count;   
    }
}