class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length; // Number of rows in the grid
        int n = grid[0].length; // Number of columns in the grid
        int countNegative = 0; // Initialize the count of negative numbers
        int row = m - 1; // Start from the last row
        int col = 0; // Start from the first column

        while (row >= 0 && col <= n - 1) {
            if (grid[row][col] < 0) {
                // If the current cell contains a negative number,
                // increment the count by the number of remaining columns in that row
                countNegative += n - col;
                row--; // Move up to the previous row
            } else {
                col++; // Move to the next column
            }
        }

        return countNegative; // Return the total count of negative numbers
    }
}
