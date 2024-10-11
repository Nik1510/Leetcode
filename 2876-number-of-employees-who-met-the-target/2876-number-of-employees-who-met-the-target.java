class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] h, int t) {
        int c=0;
       for(int i =0; i< h.length;i++){
        if(h[i]>=t){
            c++;
        }
       } 
       return c;
    }
}