class MinStack {
    Stack<Integer> first;
    Stack<Integer> minStack;

    public MinStack() {
        first= new Stack<>();
        minStack= new Stack<>();
    }
    
    public void push(int val) {
        first.push(val);
        if(minStack.isEmpty() || val<= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(!minStack.isEmpty() && first.peek().equals(minStack.peek())){
            minStack.pop();
        }
        first.pop();
    }
    
    public int top() {
        return first.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */