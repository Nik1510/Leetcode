class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (!stack.isEmpty()) {
                    stack.pop(); 
                }
            } else {
                stack.push(ch); 
            }
        }
        
        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }

        return str.reverse().toString(); 
    }
}
