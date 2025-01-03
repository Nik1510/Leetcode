class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long sum =0; // total sum 
        int count =0; 
        long x=0;
        for(int i =0; i<n;i++){
            sum+=nums[i];
        }
        
        for(int i =0; i<n-1;i++){
            x =x+ nums[i];
           sum-=nums[i];
           if(x>=sum) count++;
        }
        return count;
    }
}