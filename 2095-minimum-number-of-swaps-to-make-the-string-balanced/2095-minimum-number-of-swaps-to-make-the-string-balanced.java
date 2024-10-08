class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
       for(char ch : s.toCharArray()){
            if(ch==']'){
                if(!stack.isEmpty() && stack.peek()=='['){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }else{
                stack.push(ch);
            }
        }
        // till here we are removed all the valid string i.e. []
        int c=0;
        while(!stack.isEmpty()){
            if(stack.pop()=='['){
                c++;
            }
        }
        return (c+1)/2;
    }
}