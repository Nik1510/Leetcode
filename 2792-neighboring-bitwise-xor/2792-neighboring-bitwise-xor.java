class Solution {
    public boolean doesValidArrayExist(int[] derived) {
       int n = derived.length;
       int x= derived[0];
       for(int i=1; i<n;i++){
        x =x^derived[i];
       }
    return (x==1)? false:true;
    }
}