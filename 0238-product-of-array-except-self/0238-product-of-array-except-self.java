class Solution {
    public int[] productExceptSelf(int[] nums) {
     int n = nums.length;
     int[] res = new int[n];
     int x = 1;
     for(int i=0; i<nums.length;i++){
        res[i]=x;
        x=x*nums[i];
     }  
     x=1; 
     for(int i =n-1;i>=0;i--){
        res[i]*=x;
        x=x*nums[i];
     }
     return res;
    }
}