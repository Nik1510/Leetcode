import java.util.Arrays;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int leftBound = lowerBound(nums, i + 1, nums.length - 1, lower - nums[i]);
            int rightBound = upperBound(nums, i + 1, nums.length - 1, upper - nums[i]);

            count += (rightBound - leftBound + 1);
        }

        return count;
    }

    // Find the smallest index such that nums[index] >= value
    private int lowerBound(int[] nums, int start, int end, int value) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < value) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    // Find the largest index such that nums[index] <= value
    private int upperBound(int[] nums, int start, int end, int value) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > value) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
