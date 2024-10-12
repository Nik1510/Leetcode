class Solution {
    public boolean kLengthApart(int[] nums, int k) {
     // to check length between two 1's
     int z=0; // distance between two 1 
     int c=0; // distance between 0

     int i =0;
     while(i < nums.length){
    
        if(nums[i] == 1){

            z++; // counting one

            if(z==2 && c<k){
                // if 1 == 2 
                return false;

                
            }
            c=0;
            z=1;
        }
        if(nums[i] == 0 && z > 0){
            c++; // counting zero
        }

        i++;

     }
     
     return true;

    }
}