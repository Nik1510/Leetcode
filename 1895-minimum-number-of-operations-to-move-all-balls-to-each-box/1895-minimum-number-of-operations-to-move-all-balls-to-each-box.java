class Solution {
    public int[] minOperations(String boxes) {
        int[] arr = new int[boxes.length()];
        char[] ch = boxes.toCharArray();
        int x =0;
        for(int i =0; i<ch.length;i++){
            int ans =0; 
            for(int j =0; j<ch.length;j++){
                if(ch[j]=='1'){
                    ans = ans +Math.abs(i-j);
                }
            }
            arr[x++]=ans;
        }
        return arr;
    }
}