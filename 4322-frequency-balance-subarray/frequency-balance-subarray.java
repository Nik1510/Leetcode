class Solution {
    public int getLength(int[] nums) {
        int maxLength = 1;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // Tracks: Element -> Its current frequency
            Map<Integer, Integer> elementCounts = new HashMap<>();
            // Tracks: Frequency -> How many distinct elements have this frequency
            Map<Integer, Integer> freqCounts = new HashMap<>();
            
            for (int j = i; j < n; j++) {
                int val = nums[j];
                int oldFreq = elementCounts.getOrDefault(val, 0);
                int newFreq = oldFreq + 1;
                
                // Update element count
                elementCounts.put(val, newFreq);
                
                // Update frequency counts dynamically
                if (oldFreq > 0) {
                    freqCounts.put(oldFreq, freqCounts.get(oldFreq) - 1);
                    if (freqCounts.get(oldFreq) == 0) {
                        freqCounts.remove(oldFreq); // Keep the map clean
                    }
                }
                freqCounts.put(newFreq, freqCounts.getOrDefault(newFreq, 0) + 1);
                
                // O(1) Validity Check
                if (elementCounts.size() == 1) {
                    maxLength = Math.max(maxLength, j - i + 1);
                } else if (freqCounts.size() == 2) {
                    // Pulling keys out of a map of size 2 is extremely fast O(1)
                    Iterator<Integer> it = freqCounts.keySet().iterator();
                    int f1 = it.next();
                    int f2 = it.next();
                    
                    if (Math.max(f1, f2) == 2 * Math.min(f1, f2)) {
                        maxLength = Math.max(maxLength, j - i + 1);
                    }
                }
            }
        }
        return maxLength;
    }
}