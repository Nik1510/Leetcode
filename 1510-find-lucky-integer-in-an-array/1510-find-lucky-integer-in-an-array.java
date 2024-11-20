class Solution {
    public int findLucky(int[] arr) {
        int c=0;
        int max=-1;
        for(int i =0; i<arr.length;i++){
            for(int j =0; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c==arr[i]){
                max=Math.max(max,c) ;
            }
            c=0;
        }
        return max;
    }
}