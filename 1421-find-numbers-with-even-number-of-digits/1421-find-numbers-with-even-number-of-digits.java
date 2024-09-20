class Solution {
    public int findNumbers(int[] nums) {
        int c =0;
        for(int i =0; i<nums.length;i++){
            int count =0;
            while (nums[i]>0){
                count++;
                nums[i]/=10;
            }
            if(count%2==0){
                c++;
            }
        }
        return c;
    }
}