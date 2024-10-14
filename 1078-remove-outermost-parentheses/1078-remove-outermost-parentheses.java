class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        String str = "";

        for(char ch: s.toCharArray()){
            if(ch=='('){
                if(!stack.isEmpty()){
                    str+=ch;
                }
                stack.push(ch);
            }else{
                stack.pop();
                if(!stack.isEmpty()){
                    str+=ch;
                }
            }
        }
        return str;
    }
}