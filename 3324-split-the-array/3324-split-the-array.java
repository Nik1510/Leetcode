class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int i =0; i<nums.length;i++){
            max= Math.max(nums[i],max);
        }

        int[] arr = new int[max+1];

        for(int i=0; i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i =0; i<arr.length;i++){
            if(arr[i]>2){
                return false;
            }
        }
        return true;
    }
}