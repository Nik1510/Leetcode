class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y =x; int extra =0;
        while(x!=0){
            int temp = x%10;
            extra = extra*10+temp;
            x/=10;
        }
        if(y==extra){
            return true;
        }else{
            return false;
        }
    }
}