class Solution {
    public int maximumSum(int[] nums) {
        int[] max= new int[82];
        int maxSum =-1;
        for(int x:nums){
            int temp = x;
            int sum = 0;
            while(temp!=0){
                sum+=temp%10;
                temp/=10;
            }
            if(max[sum]!=0){
                maxSum=Math.max(maxSum,x+max[sum]);
            }
            max[sum]=Math.max(max[sum],x);
        }
        return maxSum;
    }
}