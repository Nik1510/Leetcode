class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int max=0;
        int product=1;
        for(int i=0;i<nums.length;i++){
            product*=nums[i];
            max=Math.max(product,max);
            if(product==0){
                product=1;
            }
        }
        product=1;
        for(int i=nums.length-1;i>0;i--){
            product*=nums[i];
            max=Math.max(product,max);
            if(product==0){
                product=1;
            }
        }
        return max;
    }
}