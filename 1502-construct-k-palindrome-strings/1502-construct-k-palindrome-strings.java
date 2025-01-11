class Solution {
    public boolean canConstruct(String s, int k) {
        if(k==s.length()) return true;
        if(k>s.length()) return false;

        char[] ch = s.toCharArray();
        int[] a = new int[26];
        for(int i =0; i<ch.length;i++){
            a[ch[i]-'a']++;
        }
        int c=0;
        for(int i =0;i<26;i++){
            if(a[i]%2!=0){
                c++;
            }
        }
        return c<=k;
    }
}