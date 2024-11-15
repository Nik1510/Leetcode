class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        // Find the longest sorted prefix
        while (left < n - 1 && arr[left] <= arr[left + 1]) {
            left++;
        }

        // If the whole array is sorted
        if (left == n - 1) return 0;

        // Find the longest sorted suffix
        while (right > 0 && arr[right - 1] <= arr[right]) {
            right--;
        }

        // Remove the whole middle section
        int result = Math.min(n - left - 1, right);

        // Try merging prefix and suffix
        int i = 0, j = right;
        while (i <= left && j < n) {
            if (arr[i] <= arr[j]) {
                result = Math.min(result, j - i - 1);
                i++;
            } else {
                j++;
            }
        }

        return result;
    }
}
