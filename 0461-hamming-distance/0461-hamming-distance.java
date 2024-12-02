class Solution {
    public int hammingDistance(int x, int y) {
        // number of bits are different 

        int ans = x^y;  // 0101

        int c=0;

        while(ans !=0){
            if((ans &1)==1){
                c++;
            }
            ans = ans>>1;
        }

        return c;
    }
}