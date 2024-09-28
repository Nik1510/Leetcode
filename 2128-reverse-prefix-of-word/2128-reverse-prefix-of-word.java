class Solution {
    public String reversePrefix(String word, char ch) {
        int l=-1;
        for(int i=0; i<word.length();i++){
            if(word.charAt(i)==ch){
                l=i;
                break;
            }
        }
        if(l==-1){
            return word; // if the character didnot match 
        }
        char[] cha = word.toCharArray(); // making the string to Array , as string is inmutable
        int left = 0;
        int right = l;
        while(left < right){
            char temp = cha[left];
            cha[left]= cha[right];
           cha[right]=temp;
            left++;
            right--;
        }
        return new String(cha);
    }
}