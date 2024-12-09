class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c = s.toCharArray();
        char[] h = t.toCharArray();
        if(c.length!=h.length) return false;
        int[] a = new int[26];
        int[] b = new int[26];

        for(int i =0; i<c.length;i++){
            a[c[i]-'a']++;
            b[h[i]-'a']++;
        }
        for(int i =0; i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}