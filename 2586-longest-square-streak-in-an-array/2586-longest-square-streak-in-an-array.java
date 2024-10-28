class Solution {
    public boolean binarySearch(int[] nums,int sq){
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(nums[mid]==sq){
                return true;
            }
            else if(sq>nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
    public int longestSquareStreak(int[] nums) {
        int c=-1;
        Arrays.sort(nums);
        for(int i =0; i<nums.length;i++){
            long f= nums[i];
            int streak=1;
            long sq = f*f;
            while(sq<=Integer.MAX_VALUE && binarySearch(nums, (int)sq)){
                    streak++;
                    f=sq;
                    sq =f*f;
            }
            if(streak>1){
                c=Math.max(streak,c);
            }
        }
        return c;
    }
}