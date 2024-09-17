class Solution {
    public int removeDuplicates(int[] nums) {
        // edge case
        if(nums.length<=2){
            return nums.length;
        }
        int count =2;
        // first two elements are sorted 
        for(int i=2; i<nums.length;i++){
            if(nums[i]!=nums[count-2]){
                nums[count] =nums[i];
                count++;
            }
        }
        return count;
    }
}