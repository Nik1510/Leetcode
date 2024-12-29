class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int maxCount = -1;
        int number = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0) continue;
            int c=0;
            for(int j =0; j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c>maxCount){
                maxCount = c;
                number = nums[i];
            }
        }
        return number;
    }
}