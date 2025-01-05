class Solution {
    public int numRookCaptures(char[][] board) {
        int captures = 0;
        int rookRow = -1, rookCol = -1;

        // Find the position of the rook ('R')
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    rookRow = i;
                    rookCol = j;
                    break;
                }
            }
        }

        // Check all four directions
        int[][] directions = {
            {0, 1},  // Right
            {0, -1}, // Left
            {1, 0},  // Down
            {-1, 0}  // Up
        };

        for (int[] dir : directions) {
            int x = rookRow, y = rookCol;
            while (true) {
                x += dir[0];
                y += dir[1];

                // Stop if out of bounds
                if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) break;

                // Stop if we hit a bishop ('B')
                if (board[x][y] == 'B') break;

                // Count if we hit a pawn ('p')
                if (board[x][y] == 'p') {
                    captures++;
                    break; // Stop after capturing the pawn
                }
            }
        }

        return captures;
    }
}
