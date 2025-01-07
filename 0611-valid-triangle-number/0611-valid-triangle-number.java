class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int c=0;
        for(int i = n;i>=2;i--){
            int start = 0; 
            int end = i-1;
            while(start<end){
                int sum = nums[start]+nums[end];
                if(sum>nums[i]){
                    c+=Math.abs(start-end);
                    end--;
                }else{
                    start++;
                }
            }
        }
        return c;
    }
}