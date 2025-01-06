class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int x=0;
        for(int i=0; i<nums.length;i+=2){
            int count =nums[i];
            while(count!=0){
                list.add(nums[i+1]);
                count--;
            }
        }
        int[] arr = new int[list.size()];
        for(int i =0; i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}