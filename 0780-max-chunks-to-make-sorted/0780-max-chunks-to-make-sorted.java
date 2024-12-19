class Solution {
    public int maxChunksToSorted(int[] arr) {
        if(arr.length==1) return 1;
        int count=0;
        int max=0;
        for(int i=0; i<arr.length;i++){
            max=Math.max(max,arr[i]);
            if(max==i){
                count++;
            }
        }
        return count;
    }
}