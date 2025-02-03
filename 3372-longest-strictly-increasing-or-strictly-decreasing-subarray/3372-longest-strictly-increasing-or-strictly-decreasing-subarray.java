class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==1) return 1;
        int incr =1;
        int dec =1;
        int longest =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                incr++;
                dec=1;
            }else if(nums[i]<nums[i-1]){
                dec++;
                incr=1;
            }else{
                dec=1;
                incr=1;
            }
            longest = Math.max(longest, Math.max(dec,incr));
        }
        return longest;
    }
}