class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] left = new int[n];
        int[] right = new int[n];

        // Fill left array (max height to the left including current index)
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        // Fill right array (max height to the right including current index)
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        int trappedWater = 0;
        // Calculate the total trapped water
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(left[i], right[i]) - height[i];
        }

        return trappedWater;
    }
}
