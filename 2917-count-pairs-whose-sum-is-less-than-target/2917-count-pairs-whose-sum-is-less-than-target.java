class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int[] arr = new int[nums.size()];
        for(int i=0; i<nums.size();i++){
            arr[i]=nums.get(i);
        }
        Arrays.sort(arr);
        int left =0;
        int right = arr.length-1;
        int c =0;

        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum<target){
                c+= right-left;
                left++;
            } else{
                right--;
            }
        }
        return c;
    }
}