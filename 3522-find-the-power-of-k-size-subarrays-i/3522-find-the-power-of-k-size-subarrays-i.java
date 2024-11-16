class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            if (areConsecutive(nums, i, i + k - 1)) {
                result[i] = findMax(nums, i, i + k - 1);
            } else {
                result[i] = -1;
            }
        }

        return result;
    }

    private boolean areConsecutive(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private int findMax(int[] nums, int start, int end) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
