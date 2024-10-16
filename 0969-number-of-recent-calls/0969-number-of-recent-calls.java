class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        // basically we have to check weather ping is >3000 or not
        // if >3000 than pop 
        queue.add(t);
        while(!queue.isEmpty() && t-3000 >queue.peek()){
            queue.poll();
        }
     return queue.size();   
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */