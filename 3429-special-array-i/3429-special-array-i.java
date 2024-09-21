class Solution {
    public boolean isArraySpecial(int[] arr) {
        if(arr.length<=1){
            return true;
        }
        for(int i=1; i<arr.length;i++){
            if(arr[i]%2==arr[i-1]%2){
                return false;
            }
        }
        return true;
    }
}