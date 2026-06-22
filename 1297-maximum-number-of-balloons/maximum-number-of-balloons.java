class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] c = new int[26];
        for(char ch : text.toCharArray()){
            c[ch-'a']++;
            
        }
        int min =Integer.MAX_VALUE;
        for(int i=0; i<26;i++){
            char ch = (char)(i+'a');
            if(ch=='b' || ch=='a' || ch=='o' || ch=='l' || ch=='n'){
                int freq = c[i];
                if(ch=='o' || ch=='l'){
                    freq = c[i]/2;
                }
                min = Math.min(min,freq);
            }
        }
        return min;
    }
}