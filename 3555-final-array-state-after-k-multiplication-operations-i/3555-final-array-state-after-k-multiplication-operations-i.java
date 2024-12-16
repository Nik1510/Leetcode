class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        
        while(k>0){
            int minIndex =0;
            int minValue =nums[0];

            for(int i =0; i<nums.length;i++){
                if(nums[i]<minValue){
                    minValue = nums[i];
                    minIndex = i;
                }
            }
            k--;
            nums[minIndex] *= multiplier;
        }
        return nums;
    }
}