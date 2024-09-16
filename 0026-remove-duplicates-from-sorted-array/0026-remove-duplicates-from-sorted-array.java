class Solution {
    public int removeDuplicates(int[] nums) {
        // i will always point to unqiue element 
        // and j will get the unqiue element from the array and give it to i 
       int i=0; int j =1;
       while(j<nums.length){
        if(nums[i]!=nums[j]){
            // got a unique element 
            // i will make space
            i++;
            nums[i]=nums[j];
        }
        j++;
       }
       return (i+1);
    }
}
