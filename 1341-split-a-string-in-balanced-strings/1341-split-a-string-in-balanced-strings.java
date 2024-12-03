class Solution {
    public int balancedStringSplit(String s) {
        char[] ch = s.toCharArray();
        int a=0;
        int b=0;
        int c=0;

        for(int i =0; i<ch.length;i++){
            if(ch[i]=='R'){
                a++;
            }
            if(ch[i]=='L'){
                b++;
            }
            if(a==b){
                a=0;
                b=0;
                c++;
            }
        }
        return c;
    }
}