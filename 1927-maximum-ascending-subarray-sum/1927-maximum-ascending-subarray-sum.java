class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length==1) return nums[0];
        int sum =0;
        int s=nums[0];
        for(int i=1;i<nums.length;i++){

            if(nums[i]<=nums[i-1]){
                sum = Math.max(sum,s);
                s=0;
            }
            s+=nums[i];
        }
        return Math.max(sum,s);
    }
}