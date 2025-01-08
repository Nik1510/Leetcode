class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();
        int n = nums.length-1;
        Arrays.sort(nums);
        for(int i= 0; i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int start =i+1;
            int end = n;
            while(start<end){
                int sum = nums[start]+nums[end]+nums[i];
                if(sum==0){
                   res.add(Arrays.asList(nums[i], nums[start], nums[end]));
                   while(start<end && nums[start]==nums[start+1]){
                    start++;
                   }
                   while(start<end && nums[end]==nums[end-1]){
                    end--;
                   }
                   start++;
                   end--;
                }
                else if(sum>0){
                    end--;
                }else{
                    start++;
                }
            }
        }
       return res;
    }
}