class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int maxPair=0;
        while(left<right){
            int sum=nums[left++]+nums[right--];
            maxPair =Math.max(sum,maxPair);
        }
        return maxPair;
    }
}