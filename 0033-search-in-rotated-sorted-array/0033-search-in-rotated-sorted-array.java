class Solution {
    public int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1; 
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases to find the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // No pivot means the array is not rotated
    }

    public int BS(int[] arr, int target) {
        int pivot = findPivot(arr);
        // If no pivot is found, do a normal binary search
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        // If the pivot is found, we have two ascending sorted subarrays
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    public int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1; // Fixed increment
            } else {
                end = mid - 1; // Fixed decrement
            }
        }
        return -1; // Target not found
    }

    public int search(int[] nums, int target) {
        return BS(nums, target);
    }
}
