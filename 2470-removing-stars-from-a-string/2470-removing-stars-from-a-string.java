class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty()){
                if(ch=='*'){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }else{
                stack.push(ch);
            }
        }
        String st="";
        while(!stack.isEmpty()){
            st=stack.pop()+st;
        }
        return st;
    }
}